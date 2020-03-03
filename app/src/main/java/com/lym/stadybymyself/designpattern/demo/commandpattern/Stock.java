package com.lym.stadybymyself.designpattern.demo.commandpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:请求类
 */
public class Stock {
    private String mName = "ABC";
    private int mQuantity = 10;

    public void buy() {
        LogUtil.i("buy: Stock=>" + mName + " " + mQuantity + ".");
    }

    public void sell() {
        LogUtil.i("sell: Stock=>" + mName + " " + mQuantity + ".");
    }
}
