package com.lym.stadybymyself.designpattern.demo.flyweightpattern;

import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;
import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-14.
 */
public class CirclePlus implements Shape {
    private String mColor;
    private int x;
    private int y;
    private int mRadius;

    public CirclePlus(String color) {
        mColor = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        mRadius = radius;
    }

    @Override
    public void draw() {
        LogUtil.i("draw: CirclePlus=> " + mColor + " " + x + " " + y + " " + mRadius);
    }
}
