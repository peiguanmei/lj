package com.p.c.designpatterntutorial.proxy.staticproxy;

/**
 * Created by shiqifeng on 2017/3/17.
 * Mail p@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject(new RealSubject());
        subject.visit();
    }
}
