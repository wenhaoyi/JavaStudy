package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemoHashMap {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String,String>();//not synchronized, allow null key
        map.put("myName","Navin");
        map.put("actor","John");
        map.put("ceo","Marisa");
        map.put("actor","John2");// key can only be unit,so it just change the value instead of creat a new one
        System.out.println(map);

        Set<String> keys = map.keySet();// this is used to get all the keys from this map in order
        for(String key: keys){
            System.out.println(key+": "+map.get(key));
        }
        System.out.println("--------------------------");
        Set<Map.Entry<String,String>> values= map.entrySet();//get the map:both key and value
        for(Map.Entry<String,String> e: values){
            System.out.println(e);
        }
        System.out.println("--------------------------");
        for(Map.Entry<String,String> e: values){
            if(e.getKey()=="ceo"){
                e.setValue("wenhaoyi");
            }
            System.out.println(e.getKey()+": "+e.getValue());
        }


    }
}
