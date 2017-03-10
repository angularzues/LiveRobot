package com.example.okhttputils;

import com.example.okhttputils.builder.GetBuilder;
import com.example.okhttputils.builder.HeadBuilder;
import com.example.okhttputils.builder.OtherRequestBuilder;
import com.example.okhttputils.builder.PostFileBuilder;
import com.example.okhttputils.builder.PostFormBuilder;
import com.example.okhttputils.builder.PostStringBuilder;
import com.example.okhttputils.callback.Callback;
import com.example.okhttputils.request.RequestCall;
import com.example.okhttputils.utils.Platform;

import java.io.IOException;
import java.util.concurrent.Executor;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/**
 * OKHttp工具
 *
 * Created by lishuangling on 2016/12/21.
 */
public class OkHttpUtils {
    public static final long DEFAULT_MILLISECONDS = 10_000L;
    private volatile static OkHttpUtils mInstance;
    private OkHttpClient mOkHttpClient;
    private Platform mPlatform;

    private OkHttpUtils(OkHttpClient okHttpClient) {
        if (okHttpClient == null) {
            mOkHttpClient = new OkHttpClient();
        } else {
            mOkHttpClient = okHttpClient;
        }

        mPlatform = Platform.get();
    }


    private static OkHttpUtils initClient(OkHttpClient okHttpClient) {
        if (mInstance == null) {
            synchronized (OkHttpUtils.class) {
                if (mInstance == null) {
                    mInstance = new OkHttpUtils(okHttpClient);
                }
            }
        }
        return mInstance;
    }

    public static OkHttpUtils getInstance() {
        return initClient(null);
    }

    public static OkHttpUtils getInstance(OkHttpClient okHttpClient){
        return initClient(okHttpClient);
    }

    public Executor getDelivery() {
        return mPlatform.defaultCallbackExecutor();
    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }

    public static GetBuilder get() {
        return new GetBuilder();
    }

    public static PostStringBuilder postString() {
        return new PostStringBuilder();
    }

    public static PostFileBuilder postFile() {
        return new PostFileBuilder();
    }

    public static PostFormBuilder post() {
        return new PostFormBuilder();
    }

    public static OtherRequestBuilder put() {
        return new OtherRequestBuilder(METHOD.PUT);
    }

    public static HeadBuilder head() {
        return new HeadBuilder();
    }

    public static OtherRequestBuilder delete() {
        return new OtherRequestBuilder(METHOD.DELETE);
    }

    public static OtherRequestBuilder patch() {
        return new OtherRequestBuilder(METHOD.PATCH);
    }

    public void execute(final RequestCall requestCall, Callback callback) {
        if (callback == null) {
            callback = Callback.CALLBACK_DEFAULT;
        }
        final Callback finalCallback = callback;
        final int id = requestCall.getOkHttpRequest().getId();

        requestCall.getCall().enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                sendExceptionResultCallback(call, e, finalCallback, id);
            }

            @Override
            public void onResponse(final Call call, final Response response) {
                try {
                    if (call.isCanceled()) {
                        sendExceptionResultCallback(call, new IOException("Canceled!"), finalCallback, id);
                        return;
                    }

                    if (!finalCallback.validateResponse(response, id)) {
                        int responseStatusCode = response.code();
                        String responseBody = response.body().string();
                        sendErrorResultCallback(call, responseStatusCode, responseBody, finalCallback, id);
                        return;
                    }

                    Object o = finalCallback.parseNetworkResponse(response, id);
                    sendSuccessResultCallback(call, o, finalCallback, id);
                } catch (Exception e) {
                    sendExceptionResultCallback(call, e, finalCallback, id);
                } finally {
                    if (response.body() != null) {
                        response.body().close();
                    }
                }

            }
        });
    }


    public void sendErrorResultCallback(final Call call, final int statusCode, final String responseBody, final Callback callback, final int id) {
        if (callback == null) {
            return;
        }

        mPlatform.execute(new Runnable() {
            @Override
            public void run() {
                callback.onErrorResponse(statusCode, responseBody, id);
                callback.onAfter(id);
            }
        });
    }

    public void sendExceptionResultCallback(final Call call, final Exception e, final Callback callback, final int id) {
        if (callback == null) {
            return;
        }

        mPlatform.execute(new Runnable() {
            @Override
            public void run() {
                callback.onException(call, e, id);
                callback.onAfter(id);
            }
        });
    }

    public void sendSuccessResultCallback(Call call, final Object object, final Callback callback, final int id) {
        if (callback == null) {
            return;
        }
        mPlatform.execute(new Runnable() {
            @Override
            public void run() {
                callback.onResponse(object, id);
                callback.onAfter(id);
            }
        });
    }

    public void cancelTag(Object tag) {
        for (Call call : mOkHttpClient.dispatcher().queuedCalls()) {
            if (tag.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call : mOkHttpClient.dispatcher().runningCalls()) {
            if (tag.equals(call.request().tag())) {
                call.cancel();
            }
        }
    }

    public static class METHOD {
        public static final String HEAD = "HEAD";
        public static final String DELETE = "DELETE";
        public static final String PUT = "PUT";
        public static final String PATCH = "PATCH";
    }
}

