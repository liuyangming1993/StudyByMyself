package com.lym.stadybymyself.designpattern.demo.prototypepattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-3.
 */
public class Cat extends Animal {
    public Cat() {
        mType = "Cat";
    }

    @Override
    void say() {
        LogUtil.i("say: CAT");
    }
}
