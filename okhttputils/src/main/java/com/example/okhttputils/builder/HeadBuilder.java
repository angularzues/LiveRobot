package com.example.okhttputils.builder;


import com.example.okhttputils.OkHttpUtils;
import com.example.okhttputils.request.OtherRequest;
import com.example.okhttputils.request.RequestCall;

/**
 * Created by lishuangling on 2016/12/21.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
