package com.synchonized.Test05;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
class EventStorage {
    private int maxSize;
    private List<Date> storage;
    public EventStorage() {
        maxSize = 5;
        storage = new LinkedList<Date>();
    }
    public synchronized void set() throws InterruptedException {
        while(storage.size() == maxSize) {

                wait();

        }
        storage.add(new Date());
        //Thread.sleep(100);
        System.out.println("Producer Set: "+storage.size());
        notifyAll();
    }
    public synchronized void get() throws InterruptedException {
        while(storage.size() == 0) {
                wait();
        }
        //Thread.sleep(100);
        System.out.println("Consumer Get: "+storage.size()+" "+((LinkedList<Date>)storage).poll());
        notifyAll();
    }
}

class Producer implements Runnable {
    private EventStorage storge;
    public Producer(EventStorage storage) {
        this.storge = storage;
    }
    public void run() {
        for(int i = 0; i < 20; i++) {
            //System.out.println("Producer count: "+i);
            try {
                storge.set();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    private EventStorage storage;
    public Consumer(EventStorage storage) {
        this.storage = storage;
    }
    public void run() {
        for (int i = 0; i < 20; i++) {
           // System.out.println("Consumer count: "+i);
            try {
                storage.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 class ProducerAndConsumer {
    public static void main(String[] args){
        EventStorage eventStorage=new EventStorage();
        Thread t1=new Thread(new Producer(eventStorage));
        Thread t2=new Thread(new Consumer(eventStorage));
        t1.start();
        t2.start();
    }
}
//     然而该notify方法的执行线程在 调用  lock.notify() 时并未立即释放obj的对象锁，
//     毕竟这段代码还是执行在 synchronized同步代码中的 。
//     实际上释放动作是在执行完 lock.notify后并且离开synchronized代码块时释放锁的。
//     因此在notify方法之后，synchronized代码块结束之前，所有其他被唤醒的，等待obj对象锁的线程依旧被阻塞。

