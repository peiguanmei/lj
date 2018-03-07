package com.p.statictest;

/**
 * Created by p on 2017/4/10.
 */
public class StaticInitDemo {
    public static int aMethod(int i)throws Exception
    {
        try{
            System.out.println(i/10);
            return i / 10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }

    public static void main(String [] args)
    {
        Base base = new Son();
        base.method();
//        base.methodB();
        try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}

class Base
{
    public void method()
    {
        System.out.println("Base");
    }
}
class Son extends Base
{
    public void method()
    {
        System.out.println("Son");
    }

    public void methodB()
    {
        System.out.println("SonB");
    }
}