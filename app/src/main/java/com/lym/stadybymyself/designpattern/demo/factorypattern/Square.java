package com.lym.stadybymyself.designpattern.demo.factorypattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-2.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        LogUtil.i("draw: Square");
    }
}
