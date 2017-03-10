package com.example.okhttputils.callback;

import java.io.IOException;

import okhttp3.Response;

/**
 *
 * Created by lishuangling on 2016/12/21.
 */
public abstract class StringCallback extends Callback<String> {

    /**
     *
     */
    private String mContent;

    @Override
    public String parseNetworkResponse(Response response, int id) throws IOException {
        mContent = response.body().string();
        return mContent;
    }

    @Override
    public String getResponseBodyContent() {
        return mContent;
    }
}
