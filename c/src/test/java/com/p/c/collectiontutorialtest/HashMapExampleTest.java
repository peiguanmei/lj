package com.p.c.collectiontutorialtest;

import com.p.c.collectiontutorial.maptutorial.HashMapExample;
import junit.framework.TestCase;

import java.util.Map;

/**
 * Created by p on 17/2/25.

 */
public class HashMapExampleTest extends TestCase {
    HashMapExample example = new HashMapExample();
    public void testInsertMap() throws Exception {
        Map<String,String> maps = example.insertMap();
        example.getAllKeyAndValue(maps);
    }

    public void testGetValue() throws Exception {

    }


}