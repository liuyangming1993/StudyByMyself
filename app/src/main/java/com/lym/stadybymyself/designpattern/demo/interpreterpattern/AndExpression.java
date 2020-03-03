package com.lym.stadybymyself.designpattern.demo.interpreterpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class AndExpression implements Expression {
    private Expression mExpression1 = null;
    private Expression mExpression2 = null;

    public AndExpression(Expression expression1, Expression expression2) {
        mExpression1 = expression1;
        mExpression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return mExpression1.interpret(context) && mExpression2.interpret(context);
    }
}
