package com.p.c.annotationstutorialtest;

import com.p.c.annotationstutorial.AMethodProcess;
import com.p.c.annotationstutorial.User;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/14.

 */
public class AMethodProcessTest extends TestCase {
    public void testInitMethod() throws Exception {
        AMethodProcess.initMethod(new User());
    }

}