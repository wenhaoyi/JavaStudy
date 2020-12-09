package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

public class ComImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%10>o2%10)
            return 1;


        return -1;
    }
}

