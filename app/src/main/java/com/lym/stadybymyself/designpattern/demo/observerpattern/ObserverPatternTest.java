package com.lym.stadybymyself.designpattern.demo.observerpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class ObserverPatternTest {
    public static void test() {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(10);
        subject.setState(15);
    }
}
