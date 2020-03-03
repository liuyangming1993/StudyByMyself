package com.lym.stadybymyself.designpattern.demo.interpreterpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class InterpreterPatternTest {
    public static void test() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        LogUtil.i("John is male?"+isMale.interpret("John"));
        LogUtil.i("Julie is a married woman?"+isMarriedWoman.interpret("Married Julie"));
    }

    //规则：Robert和John是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie是一个已婚女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
