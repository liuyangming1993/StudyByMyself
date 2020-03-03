package com.lym.stadybymyself.designpattern.demo.bridgepattern;

/**
 * Created by liuyangming on 17-11-10.
 */
public class BridgePatternTest {
    public static void test() {
        AbstractShape shape = new Triangle();
        shape.mAbstractColor = new Yellow();
        shape.draw();
    }
}
