package com.lym.stadybymyself.designpattern.demo.proxypattern;

/**
 * Created by liuyangming on 17-11-14.
 */
public class ProxyPatternTest {
    public static void test() {
        Image image = new ProxyImage("test.jpg");
        image.display();
        image.display();
    }
}
