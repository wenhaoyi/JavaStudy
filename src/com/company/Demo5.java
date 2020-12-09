package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Demo5 {
    public static void main(String[] args) throws Exception{
       // Vector <Integer> v = new Vector<Integer>();//keep add 100% if the capacity is not enough,thread safe,slow
            ArrayList<Integer> v= new ArrayList<>();//50%, not thread safe,fast

//        v.add(4);
//        v.add(7);
//        v.add(4);
//        v.add(7);
//        v.add(4);
//        v.add(7);
//        v.add(4);
//        v.add(7);
//        v.add(4);
//        v.add(7);
//        v.add(4);
//        v.add(7);
//        System.out.println(v.size());//how many we have now
//        System.out.println(v.capacity());//how many elements we can put in
//        v.remove(4);
        for(int i:v){
            System.out.println(i);
        }

    }

}
