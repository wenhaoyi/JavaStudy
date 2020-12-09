package com.synchonized.Test03;

public class Synchronized_Test03 {
    public static void main(String[] args){
        Method method=new Method();

        Thread t1=new Thread(new MyRunnable1(method));
        Thread t2=new Thread(new MyRunnable2(method));
        t1.start();
        t2.start();

    }
}
class Method{
    public  void Method1(){
        synchronized (this){
            for(int i=0;i<10;i++)
                System.out.println(Thread.currentThread().getName()+" Method1: "+i);
        }

    }
    public synchronized void Method2(){
        for(int i=0;i<10;i++)
            System.out.println(Thread.currentThread().getName()+" Method2 "+i);
    }
}
class MyRunnable1 implements Runnable{
    Method method;
    MyRunnable1(Method method){
        this.method=method;
    }
    public void run() {
        method.Method1();
    }
}
class MyRunnable2 implements Runnable{
    Method method;
    MyRunnable2(Method method){
        this.method=method;
    }
    public void run(){
        method.Method2();
    }
}
