package com.p.c.threadtutorialtest.char04test;

import com.p.c.threadtutorial.char04.FairService;
import junit.framework.TestCase;

/**
 * Created by p on 17/1/27.

 */
public class FairServiceTest extends TestCase {
    public void testServiceMethod() throws Exception {

        FairService fairService = new FairService(false);
        Thread[] threadArrays = new Thread[10];
        for (int i = 0 ; i < threadArrays.length;i++){
            threadArrays[i] = new Thread(fairService::serviceMethod);
        }

        for (Thread thread : threadArrays){
            thread.start();
        }

        Thread.sleep(1000 * 5);
    }

}