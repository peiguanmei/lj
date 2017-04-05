package com.p.designmodel;

public class DoubleCheckSignTon {
    private static DoubleCheckSignTon instance = null;

    public DoubleCheckSignTon() {

    }

    public static DoubleCheckSignTon getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSignTon.class) {
                if (instance == null) {
                    instance = new DoubleCheckSignTon();
                }
            }
        }
        return instance;
    }

}
