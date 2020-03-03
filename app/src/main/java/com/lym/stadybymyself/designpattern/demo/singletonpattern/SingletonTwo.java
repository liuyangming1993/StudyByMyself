package com.lym.stadybymyself.designpattern.demo.singletonpattern;

/**
 * Created by liuyangming on 17-11-6.
 * 登记式/静态内部类
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 使用场景：在需要Lazy loading时使用
 */
public class SingletonTwo {
    private static class SingletonHolder {
        private static final SingletonTwo SINGLETON_TWO = new SingletonTwo();
    }

    private SingletonTwo() {
    }

    public static final SingletonTwo getInstance() {
        return SingletonHolder.SINGLETON_TWO;
    }
}
