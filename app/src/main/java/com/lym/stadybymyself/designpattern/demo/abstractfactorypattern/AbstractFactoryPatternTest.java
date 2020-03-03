package com.lym.stadybymyself.designpattern.demo.abstractfactorypattern;


import com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.factory.AbstractFactory;
import com.lym.stadybymyself.designpattern.demo.abstractfactorypattern.factory.FactoryProducer;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;

/**
 * Created by liuyangming on 17-11-2.
 */
public class AbstractFactoryPatternTest {
    public static void test() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("RED");
        red.fill();
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}
