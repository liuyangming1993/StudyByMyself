package com.lym.stadybymyself.designpattern.demo.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-13.
 */
public class Employee {
    private String mName;
    private String mDept;
    private List<Employee> mSubordinates;

    public Employee(String name, String dept) {
        mName = name;
        mDept = dept;
        mSubordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        mSubordinates.add(employee);
    }

    public void remove(Employee employee) {
        mSubordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return mSubordinates;
    }

    @Override
    public String toString() {
        return "Employee: Name=>" + mName + " Dept=>" + mDept;
    }
}
