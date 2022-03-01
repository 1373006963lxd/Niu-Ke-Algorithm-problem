package com.lxd.niukework.ThreadPrint;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadOrderPrintCountDown {

//    private static int num = 1;
//    private static volatile int num = 1;
        private  static  AtomicInteger num = new AtomicInteger(1);
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"主线程开始");
        CountDownLatch countDownLatch = new CountDownLatch(10000);
        for(int i=1;i<=10000;i++){
            new Thread(()->{
                try {
                    System.out.println(Thread.currentThread().getName()+"打印: "+num.getAndIncrement());
                    countDownLatch.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            },"线程"+i).start();
        }
        System.out.println(Thread.currentThread().getName()+"主线程等待");
        countDownLatch.await();
        System.out.println("Finished");
    }
}
