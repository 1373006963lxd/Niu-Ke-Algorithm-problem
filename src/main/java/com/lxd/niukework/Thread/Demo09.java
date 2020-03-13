package com.lxd.niukework.Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class print1{
    private int number=0;
    private int flag = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    public void print() throws InterruptedException {
        lock.lock();
        while (flag!=1){
            condition.await();
        }
        if(number<30) {
            number++;
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName() + "打印了" + number);
        }
        flag = 2;
        condition1.signal();
        lock.unlock();
    }
    public void print1() throws InterruptedException {
        lock.lock();
        while (flag!=2){
            condition1.await();
        }
        if(number<30) {
            number++;
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName() + "打印了" + number);
        }
        flag = 3;
        condition2.signal();
        lock.unlock();
    }
    public void print2() throws InterruptedException {
        lock.lock();
        while (flag!=3){
            condition2.await();
        }
        if(number<30) {
            number++;
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName() + "打印了" + number);
        }
        flag = 1;
        condition.signal();
        lock.unlock();
    }
}
public class Demo09 {
    public static void main(String[] args) {
        print1 p = new print1();
        new Thread(()->{
            try {
                for (int i = 0; i <30 ; i++) {
                    p.print();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(()->{
            try {
                for (int i = 0; i <30 ; i++) {
                    p.print1();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

        new Thread(()->{
            try {
                for (int i = 0; i <30 ; i++) {
                    p.print2();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"C").start();
    }
}
