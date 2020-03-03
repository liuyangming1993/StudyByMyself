package com.lym.stadybymyself.designpattern.demo.visitorpattern;

/**
 * Created by liuyangming on 17-11-16.
 * Description:
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
