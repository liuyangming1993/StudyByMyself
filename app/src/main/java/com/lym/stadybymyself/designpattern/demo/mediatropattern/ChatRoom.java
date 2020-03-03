package com.lym.stadybymyself.designpattern.demo.mediatropattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        LogUtil.i(user.getName() + ": " + message);
    }
}
