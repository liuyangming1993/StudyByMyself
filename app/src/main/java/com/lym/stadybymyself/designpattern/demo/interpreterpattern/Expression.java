package com.lym.stadybymyself.designpattern.demo.interpreterpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:表达式接口
 */
public interface Expression {
    boolean interpret(String context);
}
