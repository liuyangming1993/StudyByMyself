package com.lym.stadybymyself.designpattern.demo.builderpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-2.
 */
public class Meal {
    private List<Item> mItems = new ArrayList<>();

    public void addItem(Item item) {
        mItems.add(item);
    }

    public float getPrice() {
        float price = 0f;
        for (Item item : mItems) {
            price = price + item.price();
        }
        LogUtil.i("PriceSum: " + price);
        return price;
    }

    public void showItems() {
        for (Item item : mItems) {
            LogUtil.i("Name: " + item.name());
            LogUtil.i("Packing: " + item.packing().pack());
            LogUtil.i("Price: " + item.price());
        }
    }
}
