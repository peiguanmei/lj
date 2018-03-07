package com.p.antinotion;

/**
 * Created by p on 2017/3/7.
 */
public interface People {
    public String name();

    public int age();

    @Deprecated
    public void work();
}
