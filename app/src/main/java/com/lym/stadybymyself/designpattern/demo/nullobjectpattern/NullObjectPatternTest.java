package com.lym.stadybymyself.designpattern.demo.nullobjectpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class NullObjectPatternTest {
    public static void test() {
        AbstractCustomer customer1 = CustomerFactory.getCustomers("Bob");
        AbstractCustomer customer2 = CustomerFactory.getCustomers("Jill");
        AbstractCustomer customer3 = CustomerFactory.getCustomers("Bill");
        LogUtil.i(customer1.getName());
        LogUtil.i(customer2.getName());
        LogUtil.i(customer3.getName());
    }
}
