package com.lym.stadybymyself.designpattern.demo.interpreterpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class TerminalExpression implements Expression {
    private String mData;

    public TerminalExpression(String data) {
        mData = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(mData)) {
            return true;
        }
        return false;
    }
}
