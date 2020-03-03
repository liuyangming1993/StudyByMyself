package com.lym.stadybymyself.designpattern.demo.chainofresponsibilitypattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-14.
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        mLevel = level;
    }

    @Override
    protected void write(String message) {
        LogUtil.i("write: DebugLogger=>" + message);
    }
}
