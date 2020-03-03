package com.lym.stadybymyself.designpattern.demo.mediatropattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class User {
    private String mName;

    public User(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
