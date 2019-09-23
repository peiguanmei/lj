package com.p.c.collectiontutorial.maptutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by shiqifeng on 2017/2/24.
 * Mail p@gmail.com
 */
public class HashMapExample {

    public Map<String, String> insertMap(){
        HashMap<String, String> maps = new HashMap<>(1);
        for (int i = 0 ; i < 10 ;i++) {
            maps.put(i + "", i + "");
        }
        return maps;
    }


    public void getValue(Map<? extends String,? extends String> maps,String key) {
        System.out.println(maps.get(key));
    }


    public void getAllKeyAndValue(Map<? extends String, ? extends String> maps) {
        Iterator iterator = maps.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.print("Key = " + entry.getKey());
            System.out.println("  value = " + entry.getValue());
        }
    }

}
