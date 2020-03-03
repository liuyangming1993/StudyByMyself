package com.lym.stadybymyself.designpattern.demo.builderpattern;

/**
 * Created by liuyangming on 17-11-2.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 25.8f;
    }
}
