package com.lym.stadybymyself.designpattern.demo.decoratorpattern;

import com.lym.stadybymyself.designpattern.demo.factorypattern.Circle;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;

/**
 * Created by liuyangming on 17-11-13.
 */
public class DecoratorPatternTest {
    public static void test() {
        Shape circle = new Circle();
        circle.draw();
        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
    }
}
