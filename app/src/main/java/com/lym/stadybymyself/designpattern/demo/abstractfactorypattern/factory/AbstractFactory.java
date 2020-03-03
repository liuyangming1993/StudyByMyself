package com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.factory;


import com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.Color;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;

/**
 * Created by liuyangming on 17-11-2.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
