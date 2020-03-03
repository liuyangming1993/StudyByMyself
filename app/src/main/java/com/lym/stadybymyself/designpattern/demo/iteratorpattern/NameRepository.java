package com.lym.stadybymyself.designpattern.demo.iteratorpattern;

/**
 * Created by liuyangming on 17-11-15.
 * Description:
 */
public class NameRepository implements Container {
    private String[] mNames = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return null;
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < mNames.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return mNames[index++];
            }
            return null;
        }
    }
}
