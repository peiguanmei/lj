package com.p.c.collectiontutorialtest;

import com.p.c.collectiontutorial.listtutorial.ArrayListDemo;
import junit.framework.TestCase;
import java.util.Iterator;

/**
 * Created by p on 17/2/7.

 */
public class ArrayListDemoTest extends TestCase {


    public void testList() throws Exception{
        ArrayListDemo demo = new ArrayListDemo();
        for (int i = 0 ;i < 10 ; i++){
            demo.getListA().add(i);
        }
        Iterator iteratorA = demo.getListA().iterator();
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next());
        }

        demo.setListC(demo.getListA());
        Iterator iteratorC = demo.getListC().iterator();
        while (iteratorC.hasNext()) {
            System.out.println(iteratorC.next());
        }

    }

}