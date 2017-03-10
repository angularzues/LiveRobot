package com.example.okhttputils.builder;

import com.example.okhttputils.request.OkHttpRequest;
import com.example.okhttputils.request.PostFileRequest;

import java.io.File;

import okhttp3.MediaType;

/**
 * Created by lishuangling on 2016/12/21.
 */
public class PostFileBuilder extends OkHttpRequestBuilder<PostFileBuilder> {
    private File file;
    private MediaType mediaType;


    public OkHttpRequestBuilder file(File file) {
        this.file = file;
        return this;
    }

    public OkHttpRequestBuilder mediaType(MediaType mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    @Override
    protected OkHttpRequest generateRequest() {
        return new PostFileRequest(url, tag, params, headers, file, mediaType, id);
    }

}
