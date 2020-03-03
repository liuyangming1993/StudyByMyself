package com.lym.stadybymyself.designpattern.demo.commandpattern;

/**
 * Created by liuyangming on 17-11-14.
 */
public class CommandPatternTest {
    public static void test() {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        Broker broker = new Broker();
        broker.tackOrder(buyStock);
        broker.tackOrder(sellStock);
        broker.placeOrders();
    }
}
