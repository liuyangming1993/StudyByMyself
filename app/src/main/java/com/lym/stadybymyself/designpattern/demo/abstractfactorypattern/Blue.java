package com.lym.stadybymyself.designpattern.demo.abstractfactorypattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-2.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        LogUtil.i("fill: Blue");
    }
}
