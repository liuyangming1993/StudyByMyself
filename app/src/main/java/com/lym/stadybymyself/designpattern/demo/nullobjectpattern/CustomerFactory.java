package com.lym.stadybymyself.designpattern.demo.nullobjectpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class CustomerFactory {
    public static final String[] names = {"Bob", "Mike", "Jill"};

    public static AbstractCustomer getCustomers(String name) {
        for (int i = 0; i < names.length; i++) {
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }
}
