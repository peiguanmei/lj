package com.p.c.collectiontutorialtest;

import com.p.c.collectiontutorial.listtutorial.SimpleArrayList;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/7.

 */
public class SimpleArrayListTest extends TestCase {
    public void testAdd() throws Exception {
        SimpleArrayList<Integer> list = new SimpleArrayList<>();
        for (int i = 0 ; i < 20 ; i++){
            list.add(i);
        }

        list.remove(1);
        for (int i = 0 ; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}