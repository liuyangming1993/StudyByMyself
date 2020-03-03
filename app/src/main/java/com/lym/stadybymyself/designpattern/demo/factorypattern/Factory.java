package com.lym.stadybymyself.designpattern.demo.factorypattern;

/**
 * Created by liuyangming on 17-11-2.
 */
public class Factory {
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
