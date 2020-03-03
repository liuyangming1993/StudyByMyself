package com.lym.stadybymyself.designpattern.demo.nullobjectpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        mName = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return mName;
    }
}
