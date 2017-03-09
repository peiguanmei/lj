package com.p.antinotion;

/**
 * Created by p on 2017/3/7.
 */
@Self.Description(desc = "i am class annotation", author = "p")
public class Child implements People{
    @Override
    @Self.Description(desc = "method annotation", author = "p")
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void work() {

    }
}
