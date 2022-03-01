package com.lxd.niukework.ThreadPrint;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrderPrint {



    public static void main(String[] args) {
        PrintTest printTest = new PrintTest();
        new Thread(()->{
            try {
                for(int i=0;i<4000;i++) {
                    printTest.print();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程1").start();

        new Thread(()->{
            try {
                for(int i=0;i<4000;i++) {
                    printTest.print1();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程2").start();

        new Thread(()->{
            try {
                for(int i=0;i<4000;i++) {
                    printTest.print2();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程3").start();
    }
}
class PrintTest {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private volatile int flag = 1;
    private volatile int num = 1;
    public void print() throws InterruptedException {
        lock.lock();
        if (flag != 1) {
            condition.await();
        }
        if(num<10000) {
            System.out.println(Thread.currentThread().getName() + "打印:" + num++);
            flag = 2;
        }
        condition1.signal();
        lock.unlock();
    }

    public void print1() throws InterruptedException {
        lock.lock();
        if (flag != 2) {
            condition1.await();
        }
        if(num<10000) {
            System.out.println(Thread.currentThread().getName() + "打印:" + num++);
            flag = 3;
        }
        condition2.signal();
        lock.unlock();
    }

    public void print2() throws InterruptedException {
        lock.lock();
        if (flag != 3) {
            condition2.await();
        }
        if(num<10000) {
            System.out.println(Thread.currentThread().getName() + "打印:" + num++);
            flag = 1;
        }
        condition.signal();
        lock.unlock();
    }
}
