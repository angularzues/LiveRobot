package com.example.okhttputils.callback;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * Created by lishuangling on 2016/12/21.
 */
public abstract class Callback<T> {
    /**
     * UI Thread
     *
     * @param request
     */
    public void onBefore(Request request, int id) {
    }

    /**
     * UI Thread
     *
     * @param
     */
    public void onAfter(int id) {
    }

    /**
     * UI Thread
     *
     * @param progress
     */
    public void inProgress(float progress, long total, int id) {

    }

    /**
     * if you parse reponse code in parseNetworkResponse, you should make this method return true.
     *
     * @param response
     * @return
     */
    public boolean validateResponse(Response response, int id) {
        return response.isSuccessful();
    }

    /**
     *
     * @return
     */
    public abstract String getResponseBodyContent();

    /**
     * Thread Pool Thread
     *
     * @param response
     */
    public abstract T parseNetworkResponse(Response response, int id) throws Exception;

    public abstract void onException(Call call, Exception e, int id);

    public abstract void onResponse(T response, int id);

    public abstract void onErrorResponse(int statusCode, String responseBody, int id);

    public static Callback CALLBACK_DEFAULT = new Callback() {

        @Override
        public String getResponseBodyContent() {
            return null;
        }

        @Override
        public Object parseNetworkResponse(Response response, int id) throws Exception {
            return null;
        }

        @Override
        public void onException(Call call, Exception e, int id) {

        }

        @Override
        public void onResponse(Object response, int id) {

        }

        @Override
        public void onErrorResponse(int statusCode, String responseBody, int id) {

        }

    };

}