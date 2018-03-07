package com.p.question;

import java.util.Map;

public class IntefactImpl implements IntefaceTest,IntTest2{

    @Override
    public Map<String, Object> testIntface(String name) {
        return null;
    }

    @Override
    public String testIntf(int age) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public static void main(String[] args) {
        
        //IntefactImpl ii = new IntefactImpl();
        System.out.println(Math.sqrt(3));
    }

}
