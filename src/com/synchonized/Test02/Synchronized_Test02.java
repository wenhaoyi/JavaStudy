package com.synchonized.Test02;
//如果将synchronized方法改成static方法，那么就是针对类对象加锁，任何以这个类对象实例化的对象都要获取锁才能操作，
//        t1，t2虽然是两个不同的实例，但都是同一个类对象的实例，所以当t1取得锁开始执行synchronized方法后，就会阻塞t2，
public class Synchronized_Test02 {
    public static void main(String[] args){
        Thread t1=new Thread(new MyRunnable());
        Thread t2=new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable{
    private synchronized static void synchMethodTest(){
        for(int i=0;i<10;i++)
            System.out.println(Thread.currentThread().getName()+" synchMethodTest: "+i);
    }
    public void run() {
        synchMethodTest();
    }
}
