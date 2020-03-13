package com.lxd.niukework.Thread;

import java.util.concurrent.TimeUnit;

class print2{
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
public class Demo10 {
    public static void main(String[] args) {
        print2 p = new print2();
        new Thread(()->{
            for (int i = 0; i <30 ; i++) {
                try {
                    p.print();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i <30; i++) {
                try {
                    p.print1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < 30; i++) {
                try {
                    p.print2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
    }
}
