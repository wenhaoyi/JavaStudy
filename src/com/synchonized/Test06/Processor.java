package com.synchonized.Test06;

import java.util.Scanner;

public class Processor {
    public void produce(int i) throws InterruptedException{
        synchronized(this){
            System.out.println("int:"+i+" Producer before wait.");
            wait();
            System.out.println("int:"+i+" Producer after wait.");
            notifyAll();
            System.out.println("int:"+i+" Producer After notify.");
        }
    }
    public void consume(int i) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        //Thread.sleep(1000);
        synchronized(this){
            //System.out.println("Waiting for return key.");
           // scanner.nextLine();
            //System.out.println("int:"+i+" Consumer before wait.");
            //wait();
            //System.out.println("int:"+i+" Consumer after wait.");
            System.out.println("int:"+i+" Consumer before notify.");
            notifyAll();
            System.out.println("int:"+i+" Consumer After notify.");
            //Thread.sleep(1000);
        }
    }
}
