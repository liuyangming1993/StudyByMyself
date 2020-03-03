package com.lym.stadybymyself.designpattern.demo.builderpattern;

/**
 * Created by liuyangming on 17-11-2.
 */
public class BuilderPatternTest {
    public static void test() {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();
        vegMeal.showItems();
        vegMeal.getPrice();

        Meal chickenMeal = builder.prepareChickenMeal();
        chickenMeal.showItems();
        chickenMeal.getPrice();
    }
}
