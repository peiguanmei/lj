package com.p.c.collectiontutorialtest;

import com.p.c.collectiontutorial.maptutorial.TreeMapExample;
import junit.framework.TestCase;

import java.util.TreeMap;

/**
 * Created by p on 17/2/25.

 */
public class TreeMapExampleTest extends TestCase {
    TreeMapExample example = new TreeMapExample();
    TreeMap<String,String> maps = example.insertMap();

    public void testGetSmallestEntry() throws Exception {
        example.getSmallestEntry(maps);
    }

    public void testGetLargestEntry() throws Exception {
        example.getLargestEntry(maps);
    }

    public void testGetHigherEntry() throws Exception {
        example.getHigherEntry(maps,"2");
    }

    public void testGetLowestEntry() throws Exception {
        example.getLowestEntry(maps,"2");
    }

    public void testGetRangeMap() throws Exception {
        example.getRangeMap(maps,"2","8");

    }

    public void testGetHeadMap() throws Exception {
        example.getHeadMap(maps,"4",true);
    }

    public void testGetTailMap() throws Exception {
        example.getTailMap(maps,"7",true);
    }

}