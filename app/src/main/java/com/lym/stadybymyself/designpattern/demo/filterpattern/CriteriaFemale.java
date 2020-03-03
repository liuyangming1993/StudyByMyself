package com.lym.stadybymyself.designpattern.demo.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-10.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> females = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                females.add(person);
            }
        }
        return females;
    }
}
