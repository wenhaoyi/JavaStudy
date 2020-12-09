package com.company;//https://www.youtube.com/watch?v=HhrQqmp3hXI&list=PLsyeobzWxl7oJj5BXYF088REBm-K4c_SR&index=2

import java.util.ArrayList;
import java.util.List;

class Container<T>
{
    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
    public void show(){
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<Integer> obj){
        System.out.println("test +"+getValue());
    }
}

public class GenericsDemo {

    public static void main(String[] args) {
	// write your code here
        int value = 5;
        List values = new ArrayList();

        Container obj = new Container();
        //Container<Integer> obj = new Container<>();
        obj.value =9.9;
        obj.show();
        obj.demo(new ArrayList<Integer>());
    }
}
