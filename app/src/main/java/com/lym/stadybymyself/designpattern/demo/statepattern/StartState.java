package com.lym.stadybymyself.designpattern.demo.statepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class StartState implements State {
    @Override
    public void doAction(Executor executor) {
        LogUtil.i("doAction: StartState");
        executor.setState(new RunningState());
    }
}
