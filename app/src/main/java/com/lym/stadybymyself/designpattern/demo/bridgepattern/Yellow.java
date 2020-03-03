package com.lym.stadybymyself.designpattern.demo.bridgepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-10.
 */
public class Yellow extends AbstractColor {
    @Override
    public void drawColor() {
        LogUtil.i("drawColor: Yellow");
    }
}
