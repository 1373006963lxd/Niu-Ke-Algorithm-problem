package com.lxd.niukework.ThreadPrint;

public class ThreadOrderPrint {
    private static volatile int num = 1;
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Thread thread = new  Thread(()->{
                System.out.println(Thread.currentThread().getName()+"打印："+num++);
            },"线程"+i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
