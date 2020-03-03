package com.lym.stadybymyself.designpattern.demo.visitorpattern;

/**
 * Created by liuyangming on 17-11-16.
 * Description:
 */
public class VisitorPatternTest {
    public static void test() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
