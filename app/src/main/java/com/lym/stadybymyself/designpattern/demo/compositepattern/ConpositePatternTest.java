package com.lym.stadybymyself.designpattern.demo.compositepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-13.
 */
public class ConpositePatternTest {
    public static void test() {
        Employee CEO = new Employee("Will", "CEO");

        Employee headSales = new Employee("Robert", "HeadSales");
        Employee headMarketing = new Employee("Bob", "HeadMarketing");

        Employee clerk1 = new Employee("Michel", "Marketing");
        Employee clerk2 = new Employee("Mike", "Marketing");

        CEO.add(headMarketing);
        CEO.add(headSales);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        LogUtil.i(CEO.toString());
        for (Employee headEmployee : CEO.getSubordinates()) {
            LogUtil.i(headEmployee.toString());
            for (Employee employee : headEmployee.getSubordinates()) {
                LogUtil.i(employee.toString());
            }
        }
    }
}
