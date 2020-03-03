package com.lym.stadybymyself.designpattern.demo.statepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class StopState implements State {
    @Override
    public void doAction(Executor executor) {
        LogUtil.i("doAction: StopState");
        executor.setState(new StartState());
    }
}
