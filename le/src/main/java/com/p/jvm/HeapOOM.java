package com.p.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
//            try {
//                list.add(new OOMObject());
//            } catch (OutOfMemoryError error) {
//                System.out.println("error");
//            }
        }
    }
}
