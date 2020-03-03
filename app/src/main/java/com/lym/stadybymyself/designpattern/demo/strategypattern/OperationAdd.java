package com.lym.stadybymyself.designpattern.demo.strategypattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
