package com.lym.stadybymyself.designpattern.demo.mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class CareTaker {
    private List<Memento> mMementoList = new ArrayList<>();
    public void add(Memento memento){
        mMementoList.add(memento);
    }

    public Memento get(int index) {
        return mMementoList.get(index);
    }
}
