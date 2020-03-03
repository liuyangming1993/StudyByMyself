package com.lym.stadybymyself.designpattern.demo.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-10.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> single = new ArrayList<>();
        for (Person person : list) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                single.add(person);
            }
        }
        return single;
    }
}
