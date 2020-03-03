package com.lym.stadybymyself.designpattern.demo.factorypattern;

/**
 * Created by liuyangming on 17-11-2.
 */
public class FactoryPatternTest {
    public static void test() {
        Factory shapeFactory = new Factory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
