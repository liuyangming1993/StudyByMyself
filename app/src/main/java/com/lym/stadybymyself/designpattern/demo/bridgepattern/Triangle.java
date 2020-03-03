package com.lym.stadybymyself.designpattern.demo.bridgepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-10.
 */
public class Triangle extends AbstractShape {
    @Override
    public void draw() {
        LogUtil.i("draw: Triangle");
        mAbstractColor.drawColor();
    }
}
