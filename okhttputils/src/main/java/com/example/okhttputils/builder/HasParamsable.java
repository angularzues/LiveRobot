package com.example.okhttputils.builder;

import java.util.Map;

/**
 * Created by lishuangling on 2016/12/21.
 */

public interface HasParamsable
{
    OkHttpRequestBuilder params(Map<String, String> params);
    OkHttpRequestBuilder addParams(String key, String val);
}
