package com.p.c.threadtutorialtest.char02test;

import com.p.c.threadtutorial.char02.PublicVar;
import com.p.c.threadtutorial.char02.PublicVarThreadA;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/1.

 */
public class PublicVarThreadATest extends TestCase {
    public void testRun() throws Exception {
        PublicVar publicVarRef = new PublicVar();
        PublicVarThreadA threadA = new PublicVarThreadA(publicVarRef);
        threadA.start();
        Thread.sleep(40);
        publicVarRef.getValue();

        Thread.sleep(1000 * 5);
    }

}