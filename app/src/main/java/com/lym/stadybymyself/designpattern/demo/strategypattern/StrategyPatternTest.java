package com.lym.stadybymyself.designpattern.demo.strategypattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class StrategyPatternTest {
    public static void test() {
        Context context = new Context(new OperationAdd());
        LogUtil.i("OperationAdd(5, 2)=>"+context.executeStrategy(5, 2));
        context = new Context(new OperationSubstract());
        LogUtil.i("OperationSubstract(3, 2)=>"+context.executeStrategy(3, 2));
    }
}
