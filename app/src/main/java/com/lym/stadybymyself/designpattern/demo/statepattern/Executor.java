package com.lym.stadybymyself.designpattern.demo.statepattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class Executor {
    private State mState;

    public Executor() {
        mState = null;
    }

    public State getState() {
        return mState;
    }

    public void setState(State state) {
        mState = state;
    }

    public void doAction() {
        mState.doAction(this);
    }
}
