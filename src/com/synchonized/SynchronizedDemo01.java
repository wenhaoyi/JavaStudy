package com.synchonized;

import java.util.Date;

public class SynchronizedDemo01 implements Runnable {


    private static int counter = 1;

    private static final Object synTest1 = new Object();

    @Override
    //public void run() {
       public  void run() {

        Date startDate = new Date(System.currentTimeMillis());;
        //synchronized (this) {
//            if(Thread.currentThread().getName()=="sync-thread-2"){
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

            for (int i = 0; i < 5; i++) {
                try {
                    synchronized(synTest1) {
                        System.out.println("线程 ：" + Thread.currentThread().getName() + " 当前计数器 ：" + (counter++) + "开始时间 ：" + startDate + " 当前时间 ：" + new Date(System.currentTimeMillis()));
                        //System.out.println("开始时间 ：" + startDate + " 当前时间 ：" + new Date(System.currentTimeMillis()));
                        //System.out.println();
                    }
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        //}
    }
    public static void main(String[] args) {
        SynchronizedDemo01 syncThread1 = new SynchronizedDemo01();
        SynchronizedDemo01 syncThread2 = new SynchronizedDemo01();//using two thread instead one so we can see the separated runnings
        Thread thread1 = new Thread(syncThread1, "sync-thread-1");
        Thread thread2 = new Thread(syncThread2, "sync-thread-2");
        thread1.start();
        thread2.start();
    }
}
