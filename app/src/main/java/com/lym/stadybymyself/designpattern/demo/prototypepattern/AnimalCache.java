package com.lym.stadybymyself.designpattern.demo.prototypepattern;

import java.util.HashMap;

/**
 * Created by liuyangming on 17-11-3.
 */
public class AnimalCache {
    private static HashMap<String, Animal> mAnimalMap = new HashMap<>();

    public static Animal getAnimal(String id) {
        Animal cachedAnimal = mAnimalMap.get(id);
        return (Animal) cachedAnimal.clone();
    }

    public static void loadCache() {
        Dog dog = new Dog();
        dog.setId("1");
        mAnimalMap.put(dog.getId(), dog);
        Cat cat = new Cat();
        cat.setId("2");
        mAnimalMap.put(cat.getId(), cat);
    }
}
