package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoTreeSet {
    public static void main(String[] args){
        Set<Integer> values = new TreeSet<>();//set will have the unit elements, treeset will automatically order the elements
        values.add(5);
        values.add(3);
        values.add(9);
        values.add(10);
        values.add(1);
        values.add(2);
        values.add(5);//not added in

        for(int i: values){
            System.out.println(i);
        }
    }
}
