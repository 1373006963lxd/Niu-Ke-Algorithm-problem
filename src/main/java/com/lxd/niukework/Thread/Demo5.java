package com.lxd.niukework.Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MyQueue{
    private Object ob;
    private ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();
    public void write(Object ob) throws InterruptedException {
        rwlock.writeLock().lock();
        this.ob = ob;
        System.out.println(Thread.currentThread().getName()+ob);
        rwlock.writeLock().unlock();
    }
    public void read() throws InterruptedException {
        rwlock.readLock().lock();
        System.out.println(Thread.currentThread().getName()+ob);
        rwlock.readLock().unlock();
    }
}
public class Demo5 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i <20 ; i++) {
            new Thread(() -> {
                try {
                    myQueue.write("lxd 521");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "写线程").start();
        }
        for (int i = 0; i <30 ; i++) {
            new Thread(() -> {
                try {
                    myQueue.read();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i) + "读线程").start();
        }
    }
}
