package com.lym.stadybymyself.designpattern.demo.observerpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        mSubject = subject;
        mSubject.attach(this);
    }

    @Override
    public void update() {
        LogUtil.i("update: BinaryString=>" + Integer.toBinaryString(mSubject.getState()));
    }
}
