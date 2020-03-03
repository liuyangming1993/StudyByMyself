package com.lym.stadybymyself.designpattern.demo.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class Subject {
    private List<Observer> mObservers = new ArrayList<>();
    private int mState;

    public int getState() {
        return mState;
    }

    public void setState(int state) {
        mState = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        mObservers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : mObservers) {
            observer.update();
        }
    }
}
