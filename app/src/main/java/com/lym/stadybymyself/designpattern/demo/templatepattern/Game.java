package com.lym.stadybymyself.designpattern.demo.templatepattern;

/**
 * Created by liuyangming on 17-11-16.
 * Description:
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
