package com.lym.stadybymyself.designpattern.demo.visitorpattern;

/**
 * Created by liuyangming on 17-11-16.
 * Description:
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
