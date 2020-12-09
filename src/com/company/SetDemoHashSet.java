package com.company;

import java.util.HashSet;
import java.util.Set;

public class SetDemoHashSet {
    public static void main(String[] args){
        Set<Integer> values = new HashSet<>();//set will have the unit elements
        values.add(5);
        values.add(6);
        values.add(9);
        System.out.println("add status: "+values.add(6));

        for(int i: values){
            System.out.println(i);
        }
    }
}
