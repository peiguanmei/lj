package com.p.c.annotationstutorialtest;

import com.p.c.annotationstutorial.AConstructorProcess;
import com.p.c.annotationstutorial.User;
import junit.framework.TestCase;

/**
 * Created by p on 17/2/14.

 */
public class AConstructorProcessTest extends TestCase {
    public void testInit() throws Exception {
        User user = new User();
        AConstructorProcess.init(user);
        System.out.println(user.toString());
    }

}