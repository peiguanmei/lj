package com.p.c.collectiontutorialtest;

import com.p.c.collectiontutorial.maptutorial.LinkedHashMapExample;
import junit.framework.TestCase;

import java.util.LinkedHashMap;

/**
 * Created by p on 17/2/25.

 */
public class LinkedHashMapExampleTest extends TestCase {
    LinkedHashMapExample example = new LinkedHashMapExample();
    public void testInsertMap() throws Exception {
        LinkedHashMap<String,String> map = example.insertMap();
        example.printMaps(map);
    }

}