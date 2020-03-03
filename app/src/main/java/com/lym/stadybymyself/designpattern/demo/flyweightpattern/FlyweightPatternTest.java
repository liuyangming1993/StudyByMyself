package com.lym.stadybymyself.designpattern.demo.flyweightpattern;

/**
 * Created by liuyangming on 17-11-14.
 */
public class FlyweightPatternTest {
    private static final String[] colors = {"Red", "Green", "Blue"};

    public static void test() {
        for (int i = 0; i < 10; i++) {
            CirclePlus circlePlus = (CirclePlus) ShapeFactoryPlus.getCirclePlus(getRandomColor());
            circlePlus.setX(getRandomX());
            circlePlus.setY(getRandomY());
            circlePlus.setRadius(100);
            circlePlus.draw();
        }
    }

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
