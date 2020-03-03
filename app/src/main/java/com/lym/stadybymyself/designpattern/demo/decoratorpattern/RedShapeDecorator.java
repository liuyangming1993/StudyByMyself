package com.lym.stadybymyself.designpattern.demo.decoratorpattern;

import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;
import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-13.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        mDecoratorShape.draw();
        setRedBorder(mDecoratorShape);
    }

    public void setRedBorder(Shape redBorder) {
        LogUtil.i("setRedBorder: redBorder");
    }
}
