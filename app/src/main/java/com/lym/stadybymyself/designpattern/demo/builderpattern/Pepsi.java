package com.lym.stadybymyself.designpattern.demo.builderpattern;

/**
 * Created by liuyangming on 17-11-2.
 */
public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 9f;
    }
}
