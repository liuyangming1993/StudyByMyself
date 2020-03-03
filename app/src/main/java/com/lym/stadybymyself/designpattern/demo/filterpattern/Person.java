package com.lym.stadybymyself.designpattern.demo.filterpattern;

/**
 * Created by liuyangming on 17-11-10.
 */
public class Person {
    private String mName;
    private String mGender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        mName = name;
        mGender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return mName;
    }

    public String getGender() {
        return mGender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        return "Name=>" + getName() + " Gender=>" + getGender() + " MaritalStatus=>" + getMaritalStatus();
    }
}
