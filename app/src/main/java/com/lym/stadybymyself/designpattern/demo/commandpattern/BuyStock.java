package com.lym.stadybymyself.designpattern.demo.commandpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class BuyStock implements Order {
    private Stock mStock;

    public BuyStock(Stock stock) {
        mStock = stock;
    }

    @Override
    public void execute() {
        mStock.buy();
    }
}
