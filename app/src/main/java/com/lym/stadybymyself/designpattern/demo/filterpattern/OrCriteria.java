package com.lym.stadybymyself.designpattern.demo.filterpattern;

import java.util.List;

/**
 * Created by liuyangming on 17-11-10.
 */
public class OrCriteria implements Criteria {
    private Criteria mCriteriaOne;
    private Criteria mCriteriaTwo;

    public OrCriteria(Criteria criteriaOne, Criteria criteriaTwo) {
        mCriteriaOne = criteriaOne;
        mCriteriaTwo = criteriaTwo;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> criteriaOneList = mCriteriaOne.meetCriteria(list);
        List<Person> criteriaTwoList = mCriteriaTwo.meetCriteria(list);
        for (Person person : criteriaTwoList) {
            if (!criteriaOneList.contains(person)) {
                criteriaOneList.add(person);
            }
        }
        return criteriaOneList;
    }
}
