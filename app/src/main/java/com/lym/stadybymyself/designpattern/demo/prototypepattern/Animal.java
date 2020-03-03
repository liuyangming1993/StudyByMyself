package com.lym.stadybymyself.designpattern.demo.prototypepattern;

import java.util.Objects;

/**
 * Created by liuyangming on 17-11-3.
 */
public abstract class Animal implements Cloneable {
    private String mId;
    protected String mType;

    abstract void say();

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
