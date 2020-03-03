package com.lym.stadybymyself.designpattern.demo.singletonpattern;

/**
 * Created by liuyangming on 17-11-6.
 * 饿汉式
 * 是否Lazy初始化：否
 * 是否多线程安全：是
 */
public class SingletonOne {
    private static SingletonOne singletonOne = new SingletonOne();

    private SingletonOne() {
    }

    public static SingletonOne getInstance() {
        return singletonOne;
    }
}
