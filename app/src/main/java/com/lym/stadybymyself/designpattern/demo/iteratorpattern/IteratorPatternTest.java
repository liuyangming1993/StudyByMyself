package com.lym.stadybymyself.designpattern.demo.iteratorpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class IteratorPatternTest {
    public static void test() {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            LogUtil.i((String) iterator.next());
        }
    }
}
