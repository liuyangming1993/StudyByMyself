package com.lym.stadybymyself.designpattern.demo.prototypepattern;

/**
 * Created by liuyangming on 17-11-3.
 */
public class PrototypePatternTest {
    public static void test() {
        AnimalCache.loadCache();
        Dog dog = (Dog) AnimalCache.getAnimal("1");
        dog.say();
        Cat cat = (Cat) AnimalCache.getAnimal("2");
        cat.say();
    }
}
