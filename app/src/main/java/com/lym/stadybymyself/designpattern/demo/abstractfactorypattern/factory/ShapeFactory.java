package com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.factory;


import com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.Color;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Circle;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Square;

/**
 * Created by liuyangming on 17-11-2.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape != null) {
            switch (shape) {
                case "CIRCLE":
                    return new Circle();
                case "SQUARE":
                    return new Square();
                default:
                    return null;
            }
        }
        return null;
    }
}
