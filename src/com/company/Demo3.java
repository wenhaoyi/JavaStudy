package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        Collection values = new ArrayList();//collection do not have index for elements, but List does
        values.add(3);
        values.add(5.8f);
        values.add("wenahoyi");
        values.add(5.8f);
        values.remove(5.8f);

        Iterator i = values.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

}
