package com.lym.stadybymyself.designpattern.demo.filterpattern;

import java.util.List;

/**
 * Created by liuyangming on 17-11-10.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> list);
}
