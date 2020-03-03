package com.lym.stadybymyself.designpattern.demo.filterpattern;

import java.util.List;

/**
 * Created by liuyangming on 17-11-10.
 */
public class AndCriteria implements Criteria {
    private Criteria mCriteriaOne;
    private Criteria mCriteriaTwo;

    public AndCriteria(Criteria criteriaOne, Criteria criteriaTwo) {
        mCriteriaOne = criteriaOne;
        mCriteriaTwo = criteriaTwo;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> criteriaOneList = mCriteriaOne.meetCriteria(list);
        return mCriteriaTwo.meetCriteria(criteriaOneList);
    }
}
