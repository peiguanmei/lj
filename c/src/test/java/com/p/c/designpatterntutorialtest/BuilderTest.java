package com.p.c.designpatterntutorialtest;

import com.p.c.designpatterntutorial.builder.Person;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/5/7.
 * Mail p@gmail.com
 */
public class BuilderTest extends TestCase {
    public void testBuild() throws Exception {
        Person person = new Person.Builder().setAge(24).setHeight(178).setName("p").setWeight(80).build();
        System.out.println(person.toString());
    }

}