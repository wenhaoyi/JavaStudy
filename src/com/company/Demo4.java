package com.company;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) throws Exception{
        List<Integer> values = new ArrayList();//collection do not have index for elements, but List does
        values.add(3);
        values.add(66);
        values.add(88);
        values.add(4);



        Comparator<Integer> com = new ComImpl();
        Collections.sort(values, com);

        for(int i: values){
            System.out.println(i);

        }
//        Collections.sort(values);
//        for(int i: values){
//            System.out.println(i);
//        }
////        Iterator i = values.iterator();
////        while(i.hasNext()){
////            System.out.println(i.next());
////        }

    }

}
