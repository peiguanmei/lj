package com.p.c.reflectiontutorial;

/**
 * Created by p on 17/1/9.

 */
@MyAnnotation(name="p",value = "hello world")
public class AnnotationObject {

    @MyAnnotation(name="field",value = "变量")
    public String field;

    @MyAnnotation(name="method",value = "方法")
    public void doSomeThing(){
        System.out.println("做一些事情");
    }

    public void doOtherThing(@MyAnnotation(name="param",value = "参数") String param){

    }
}
