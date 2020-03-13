package com.lxd.niukework.Thread;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class saleT{
    private int flag = 1;
    private int number=30;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Condition condition1 =lock.newCondition();
    private Condition condition2 =lock.newCondition();
    public void sale() throws InterruptedException {
        lock.lock();
        while (flag!=1){
            condition.await();
        }
        if(number>0) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + "卖出第" + number-- +
                    "张票");
        }
        flag = 2;
        condition1.signal();
        lock.unlock();
        }

    public void sale1() throws InterruptedException {
        lock.lock();
        while (flag!=2){
            condition1.await();
        }
        if(number>0){
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + "卖出第" + number-- +
                    "张票");
        }
        flag = 3;
        condition2.signal();
        lock.unlock();
    }

    public void sale2() throws InterruptedException {
        lock.lock();
        while (flag!=3){
            condition2.await();
        }
        if(number>0){
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + "卖出第" + number-- +
                    "张票");
        }
        flag = 1;
        condition.signal();
        lock.unlock();
    }

    }
public class Demo4 {
    public static void main(String[] args) {
        saleT sT = new saleT();
        new Thread(()->{
            for (int i = 0; i <40 ; i++) {
                try {
                    sT.sale();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i <40 ; i++) {
                try {
                    sT.sale1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i <40 ; i++) {
                try {
                    sT.sale2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
    }

}
