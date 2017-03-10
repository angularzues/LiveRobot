package com.example.okhttputils.builder;


import com.example.okhttputils.request.OkHttpRequest;
import com.example.okhttputils.request.RequestCall;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lishuangling on 2016/12/21.
 */
public abstract class OkHttpRequestBuilder<T extends OkHttpRequestBuilder> {

    protected String url;
    protected Object tag;
    protected Map<String, String> headers;
    protected Map<String, String> params;
    protected int id;

    public T id(int id) {
        this.id = id;
        return (T) this;
    }

    public T url(String url) {
        this.url = url;
        return (T) this;
    }

    public T tag(Object tag) {
        this.tag = tag;
        return (T) this;
    }

    public T headers(Map<String, String> headers) {
        this.headers = headers;
        return (T) this;
    }

    public T addHeader(String key, String val) {
        if (this.headers == null) {
            headers = new LinkedHashMap<>();
        }
        headers.put(key, val);
        return (T) this;
    }

    /**
     * @return
     */
    protected abstract OkHttpRequest generateRequest();

    /**
     * @return
     */
    public RequestCall build() {
        // 添加统一公共参数
//        addHeader("X-App-Common", IdentityManager.getInstance().getHeadAppEnv())
        OkHttpRequest request = generateRequest();
        return request.build();
    }
}
