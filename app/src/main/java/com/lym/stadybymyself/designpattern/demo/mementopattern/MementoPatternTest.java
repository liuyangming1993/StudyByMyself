package com.lym.stadybymyself.designpattern.demo.mementopattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class MementoPatternTest {
    public static void test() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        LogUtil.i("Current state: "+originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        LogUtil.i("First saved state: "+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        LogUtil.i("Second saved state: "+originator.getState());
    }
}
