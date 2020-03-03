package com.lym.stadybymyself.designpattern.demo.chainofresponsibilitypattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-14.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        mLevel = level;
    }

    @Override
    protected void write(String message) {
        LogUtil.i("write: ErrorLogger=>" + message);
    }
}
