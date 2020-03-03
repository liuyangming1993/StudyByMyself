package com.lym.stadybymyself.designpattern.demo.flyweightpattern;

import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;
import com.lym.stadybymyself.designpattern.LogUtil;

import java.util.HashMap;

/**
 * Created by liuyangming on 17-11-14.
 */
public class ShapeFactoryPlus {
    private static final HashMap<String, Shape> mCirclePlusMap = new HashMap<>();

    public static Shape getCirclePlus(String color) {
        CirclePlus circlePlus = (CirclePlus) mCirclePlusMap.get(color);
        if (circlePlus == null) {
            circlePlus = new CirclePlus(color);
            mCirclePlusMap.put(color, circlePlus);
            LogUtil.i("Creating circlePlus of color: " + color);
        }
        return circlePlus;
    }
}
