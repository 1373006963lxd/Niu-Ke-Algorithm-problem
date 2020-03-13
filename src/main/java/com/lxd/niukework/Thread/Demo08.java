package com.lxd.niukework.Thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class print{
    private int number = 0;
    private  Lock lock = new ReentrantLock();
    public void print(){
        lock.lock();
        number++;
        System.out.println(Thread.currentThread().getName()+"打印了"+number);
        lock.unlock();
    }
}
public class Demo08 {
    public static void main(String[] args) {
        print p = new print();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                p.print();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                p.print();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                p.print();
            }
        },"C").start();
    }
}
