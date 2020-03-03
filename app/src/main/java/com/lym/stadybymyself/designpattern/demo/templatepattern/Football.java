package com.lym.stadybymyself.designpattern.demo.templatepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-16.
 * Description:
 */
public class Football extends Game {
    @Override
    void initialize() {
        LogUtil.i("initialize: Football");
    }

    @Override
    void startPlay() {
        LogUtil.i("startPlay: Football");
    }

    @Override
    void endPlay() {
        LogUtil.i("endPlay: Football");
    }
}
