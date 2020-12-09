package com.synchonized.Test06;

public class App {
    public static void main(String[] args) throws InterruptedException{
        final Processor processor = new Processor();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    for(int i=0;i<10;i++){
                        processor.produce(i);
                        System.out.println("int:"+i+" Producer loop");
                    }
                    //processor.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    for(int i=0;i<10;i++){
                        processor.consume(i);
                        System.out.println("int:"+i+" Consumer loop");
                    }
                    //processor.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        //t1.join();
        //
        // t2.join();

    }
}

