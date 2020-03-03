package com.lym.stadybymyself.designpattern.demo.statepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-29.
 * Description:
 */
public class RunningState implements State {
    @Override
    public void doAction(Executor executor) {
        LogUtil.i("doAction: RunningState");
        executor.setState(new StopState());
    }
}
