package com.lym.stadybymyself.designpattern.demo.observerpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public abstract class Observer {
    protected Subject mSubject;

    public abstract void update();
}
