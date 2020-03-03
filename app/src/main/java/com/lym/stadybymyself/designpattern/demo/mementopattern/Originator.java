package com.lym.stadybymyself.designpattern.demo.mementopattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class Originator {
    private String mState;

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(mState);
    }

    public void getStateFromMemento(Memento memento) {
        mState = memento.getState();
    }
}
