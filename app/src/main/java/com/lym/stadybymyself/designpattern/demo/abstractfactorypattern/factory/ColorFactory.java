package com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.factory;


import com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.Blue;
import com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.Color;
import com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.Red;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;

/**
 * Created by liuyangming on 17-11-2.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color != null) {
            switch (color) {
                case "RED":
                    return new Red();
                case "BLUE":
                    return new Blue();
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
