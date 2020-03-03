package com.lym.stadybymyself.designpattern.demo.filterpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangming on 17-11-10.
 */
public class FilterPatternTest {
    public static void test() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Bill", "MALE", "Single"));
        list.add(new Person("Will", "MALE", "Married"));
        list.add(new Person("Nancy", "FEMALE", "Single"));
        list.add(new Person("Lucy", "FEMALE", "Married"));
        list.add(new Person("Jill", "MALE", "Married"));
        list.add(new Person("Lily", "FEMALE", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOrFemale = new OrCriteria(single, female);

        LogUtil.i("male: ");
        printList(male.meetCriteria(list));
        LogUtil.i("female: ");
        printList(female.meetCriteria(list));
        LogUtil.i("singleMale: ");
        printList(singleMale.meetCriteria(list));
        LogUtil.i("singleOrFemale: ");
        printList(singleOrFemale.meetCriteria(list));
    }

    private static void printList(List<Person> list) {
        for (Person person : list) {
            LogUtil.i(person.toString());
        }
    }
}
