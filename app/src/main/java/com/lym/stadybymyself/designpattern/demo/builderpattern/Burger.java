package com.lym.stadybymyself.designpattern.demo.builderpattern;

/**
 * Created by liuyangming on 17-11-2.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
