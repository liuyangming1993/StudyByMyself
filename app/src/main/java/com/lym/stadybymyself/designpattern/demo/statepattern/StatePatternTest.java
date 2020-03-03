package com.lym.stadybymyself.designpattern.demo.statepattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class StatePatternTest {
    public static void test() {
        Executor executor = new Executor();
        executor.setState(new StartState());
        executor.doAction();
        executor.doAction();
        executor.doAction();
    }
}
