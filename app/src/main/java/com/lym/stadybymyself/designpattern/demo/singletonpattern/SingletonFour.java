package com.lym.stadybymyself.designpattern.demo.singletonpattern;

/**
 * Created by liuyangming on 17-11-6.
 * 双重校验锁
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 */
public class SingletonFour {
    private volatile static SingletonFour singletonFour;

    private SingletonFour() {
    }

    public static SingletonFour getInstance() {
        if (singletonFour == null) {
            synchronized (SingletonFour.class) {
                if (singletonFour == null) {
                    singletonFour = new SingletonFour();
                }
            }
        }
        return singletonFour;
    }
}
