package com.synchonized.Test04;
//从结果可以看到，t1并没有阻塞t2的运行，因为t2执行的method2方法不带synchronized，所以在执行时并不需要先获得method对象的锁，执行的过程中也就不存在阻塞的情况。
public class Synchronized_Test04 {
    public static void main(String[] args){
        Method method=new Method();
        Thread t1=new Thread(new MyRunnable1(method));
        Thread t2=new Thread(new MyRunnable2(method));
        t1.start();
        t2.start();
    }
}
class Method{
    public synchronized void Method1(){
        for(int i=0;i<10;i++)
            System.out.println(Thread.currentThread().getName()+" Method1: "+i);
    }
    public void Method2(){
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
