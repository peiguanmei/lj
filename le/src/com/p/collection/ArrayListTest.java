package com.p.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListTest {
    
    public static void main(String[] args) {
        ArrayList<?> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(null, "2");
        map.put("1", "1");
        System.out.println(map.get("0"));
    }

}
