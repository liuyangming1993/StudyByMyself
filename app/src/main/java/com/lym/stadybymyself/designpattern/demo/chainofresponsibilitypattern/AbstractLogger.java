package com.lym.stadybymyself.designpattern.demo.chainofresponsibilitypattern;

/**
 * Created by liuyangming on 17-11-14.
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    protected int mLevel;
    protected AbstractLogger mNextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        mNextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (mLevel <= level) {
            write(message);
            return;
        }
        if (mNextLogger != null) {
            mNextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
