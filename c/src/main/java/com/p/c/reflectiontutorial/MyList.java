package com.p.c.reflectiontutorial;

import java.util.List;

/**
 * Created by p on 17/1/9.

 */
public class MyList<T> {

    public List<T> lists;
    public List<String> stringLists ;


    public List<String> getStringLists() {
        return stringLists;
    }

    public void setStringLists(List<String> stringLists) {
        this.stringLists = stringLists;
    }

    public void add(T t){
        lists.add(t);
    }

    public T get(int index){
        return lists.get(index);
    }
}
