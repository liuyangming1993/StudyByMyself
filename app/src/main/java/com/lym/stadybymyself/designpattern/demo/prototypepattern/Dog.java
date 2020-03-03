package com.lym.stadybymyself.designpattern.demo.prototypepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-3.
 */
public class Dog extends Animal {
    public Dog() {
        mType = "DOG";
    }

    @Override
    void say() {
        LogUtil.i("say: DOG");
    }
}
