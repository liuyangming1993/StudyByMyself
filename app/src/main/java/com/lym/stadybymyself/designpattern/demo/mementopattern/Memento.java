package com.lym.stadybymyself.designpattern.demo.mementopattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class Memento {
    private String mState;

    public Memento(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }
}
