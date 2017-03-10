package com.example.okhttputils.request;

import java.util.Map;

import okhttp3.Request;
import okhttp3.RequestBody;

/**
 *
 * Created by lishuangling on 2016/12/21.
 */
public class GetRequest extends OkHttpRequest {
    public GetRequest(String url, Object tag, Map<String, String> params, Map<String, String> headers, int id) {
        super(url, tag, params, headers, id);
    }

    @Override
    public String getRequestBodyContent() {
        return null;
    }

    @Override
    protected RequestBody buildRequestBody() {
        return null;
    }

    @Override
    protected Request buildRequest(RequestBody requestBody) {
        return builder.get().build();
    }


}
