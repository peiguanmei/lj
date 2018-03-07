package com.p.Inner;

/*
 * 成员内部类   可以访问外部类的所有方法、成员及this
 */
public class MemberInner {
    private int x = 100;
    
    public void makeInner(){
        Inner in = new Inner();
        in.seeMemInner();
    }
    
    class Inner{
        public void seeMemInner(){
            System.out.println("outer x is"+x);
            System.out.println("inner x is"+this);
            System.out.println("outer x is"+MemberInner.this);
        }
    }
    
    public static void main(String[] args) {
        MemberInner memberInner = new MemberInner();
        Inner inner = memberInner.new Inner();
        inner.seeMemInner();
    }
}
