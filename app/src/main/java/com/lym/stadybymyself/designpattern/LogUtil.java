package com.lym.stadybymyself.designpattern;

import android.util.Log;

/**
 * Created by liuyangming on 17-11-2.
 */
public class LogUtil {
    private static final String TAG = "LogUtil";

    public static void i(String tag, String msg) {
        Log.i(tag, msg);
    }

    public static void i(String msg) {
        Log.i(TAG, msg);
    }
}
