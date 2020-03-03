package com.lym.stadybymyself.designpattern.demo.strategypattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class Context {
    private Strategy mStrategy;

    public Context(Strategy strategy) {
        mStrategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return mStrategy.doOperation(num1, num2);
    }
}
