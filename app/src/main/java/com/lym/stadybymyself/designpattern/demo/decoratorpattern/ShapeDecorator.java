package com.lym.stadybymyself.designpattern.demo.decoratorpattern;

import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;

/**
 * Created by liuyangming on 17-11-13.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape mDecoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        mDecoratorShape = decoratorShape;
    }

    public void draw() {
        mDecoratorShape.draw();
    }
}
