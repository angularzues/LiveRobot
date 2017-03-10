package com.example.okhttputils.utils;

/**
 * Created by lishuangling on 2016/12/21.
 */
public class Exceptions
{
    public static void illegalArgument(String msg, Object... params)
    {
        throw new IllegalArgumentException(String.format(msg, params));
    }


}
