package com.company;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemoHashTable {
    public static void main(String[] args){
        Map<String, String> map = new Hashtable<>();//synchronized
        map.put("myName","Navin");
        map.put("actor","John");
        map.put("ceo","Marisa");
        map.put("actor","John2");// key can only be unit
        System.out.println(map);

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+": "+map.get(key));
        }


    }
}
