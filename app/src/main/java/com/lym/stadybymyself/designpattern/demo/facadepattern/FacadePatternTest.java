package com.lym.stadybymyself.designpattern.demo.facadepattern;

/**
 * Created by liuyangming on 17-11-13.
 */
public class FacadePatternTest {
    public static void test() {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
    }
}
