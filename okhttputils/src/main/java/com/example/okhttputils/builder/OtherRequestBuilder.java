package com.example.okhttputils.builder;

import com.example.okhttputils.request.OkHttpRequest;
import com.example.okhttputils.request.OtherRequest;

import okhttp3.RequestBody;

/**
 * DELETE、PUT、PATCH等其他方法
 * Created by lishuangling on 2016/12/21.
 */
public class OtherRequestBuilder extends OkHttpRequestBuilder<OtherRequestBuilder> {
    private RequestBody requestBody;
    private String method;
    private String content;

    public OtherRequestBuilder(String method) {
        this.method = method;
    }

    @Override
    protected OkHttpRequest generateRequest() {
        return new OtherRequest(requestBody, content, method, url, tag, params, headers, id);
    }

    public OtherRequestBuilder requestBody(RequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    public OtherRequestBuilder requestBody(String content) {
        this.content = content;
        return this;
    }

}
