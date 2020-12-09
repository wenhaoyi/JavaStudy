package com.synchonized.Test01;
//因为synchronized是写在普通方法前，是对特定的实例对象加锁，t1，t2为两个不同的实例，
//        所以他们在执行synchronized方法时并不会互相阻塞对方。
public class Synchronized_Test01 {
    public static void main(String[] args){
        Thread t1=new Thread(new MyRunnable());
        Thread t2=new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{
    private synchronized void synchMethodTest(){
        for(int i=0;i<10;i++)
            System.out.println(Thread.currentThread().getName()+" synchMethodTest: "+i);
    }
    public void run() {
        synchMethodTest();
    }
}
