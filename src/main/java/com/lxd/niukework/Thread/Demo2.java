package com.lxd.niukework.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ticket2{
    private int number = 300;
    private Lock lock = new ReentrantLock();
    public  void sale(){
        lock.lock();
//        ctrl + alt + t
        try {
            if(number>0){
                System.out.println(Thread.currentThread().getName()+"卖出第"
                +number--+"张还剩余"+number+"张");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Ticket2 ticket2 = new Ticket2();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <40 ; i++) {
                    ticket2.sale();
                }
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <40 ; i++) {
                    ticket2.sale();
                }
            }
        },"B").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <40 ; i++) {
                    ticket2.sale();
                }
            }
        },"C").start();
    }

}
