package com.lym.stadybymyself.designpattern.demo.builderpattern;

/**
 * Created by liuyangming on 17-11-2.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 15.6f;
    }
}
