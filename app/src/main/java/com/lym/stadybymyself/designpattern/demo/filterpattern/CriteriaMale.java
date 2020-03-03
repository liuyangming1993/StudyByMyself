package com.lym.stadybymyself.designpattern.demo.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-10.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> males = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                males.add(person);
            }
        }
        return males;
    }
}
