package com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.factory;

/**
 * Created by liuyangming on 17-11-2.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory != null) {
            switch (factory) {
                case "SHAPE":
                    return new ShapeFactory();
                case "COLOR":
                    return new ColorFactory();
                default:
                    return null;
            }
        }
        return null;
    }
}
