package com.lym.stadybymyself.designpattern.demo.facadepattern;

import com.lym.stadybymyself.designpattern.demo.factorypattern.Circle;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Shape;
import com.lym.stadybymyself.designpattern.demo.factorypattern.Square;

/**
 * Created by liuyangming on 17-11-13.
 */
public class ShapeMaker {
    private Shape mCircle;
    private Shape mSquare;

    public ShapeMaker() {
        mCircle = new Circle();
        mSquare = new Square();
    }

    public void drawCircle() {
        mCircle.draw();
    }

    public void drawSquare() {
        mSquare.draw();
    }
}
