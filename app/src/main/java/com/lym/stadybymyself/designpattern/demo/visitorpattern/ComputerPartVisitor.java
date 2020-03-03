package com.lym.stadybymyself.designpattern.demo.visitorpattern;

/**
 * Created by liuyangming on 17-11-16.
 * Description:
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
