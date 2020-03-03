package com.lym.stadybymyself.designpattern.demo.nullobjectpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Avaliable in Customer Database.";
    }
}
