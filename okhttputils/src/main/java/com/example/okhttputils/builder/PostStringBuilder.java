package com.example.okhttputils.builder;

import com.example.okhttputils.request.OkHttpRequest;
import com.example.okhttputils.request.PostStringRequest;

import okhttp3.MediaType;


/**
 * Created by lishuangling on 2016/12/21.
 */
public class PostStringBuilder extends OkHttpRequestBuilder<PostStringBuilder> {
    private String content;
    private MediaType mediaType;


    public PostStringBuilder content(String content) {
        this.content = content;
        return this;
    }

    public PostStringBuilder mediaType(MediaType mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    @Override
    protected OkHttpRequest generateRequest() {
        return new PostStringRequest(url, tag, params, headers, content, mediaType, id);
    }

}
