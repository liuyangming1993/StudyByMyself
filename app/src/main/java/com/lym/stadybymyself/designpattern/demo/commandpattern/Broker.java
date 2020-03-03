package com.lym.stadybymyself.designpattern.demo.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-15.
 * Description:命令调用类
 */
public class Broker {
    private List<Order> mOrderList = new ArrayList<>();

    public void tackOrder(Order order) {
        mOrderList.add(order);
    }

    public void placeOrders() {
        for (Order order : mOrderList) {
            order.execute();
        }
        mOrderList.clear();
    }
}
