package com.lxd.niukework.Thread;

import java.util.concurrent.TimeUnit;

class prin{
    private int number = 0;
    public synchronized  void print() throws InterruptedException {
        this.notify();
        if(number<30) {
            number++;
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"打印"+number);
        }
        this.wait();
    }
    public synchronized void print1() throws InterruptedException {
        this.notify();
        if(number<30) {
            number++;
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"打印"+number);
        }
        this.wait();
    }

    public synchronized void print2() throws InterruptedException {
        this.notify();
        if(number<30) {
            number++;
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"打印"+number);
        }
        this.wait();
    }
}
