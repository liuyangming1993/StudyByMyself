package com.lym.stadybymyself.designpattern.demo.mediatropattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class MediatorPatternTest {
    public static void test() {
        User mike = new User("Mike");
        User rose = new User("Rose");
        mike.sendMessage("Hi,Rose.");
        rose.sendMessage("Hey,man.");
    }
}
