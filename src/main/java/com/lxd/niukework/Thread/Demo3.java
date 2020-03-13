package com.lxd.niukework.Thread;

import java.util.concurrent.TimeUnit;

class saleTicket{
    private int number = 30;
    public synchronized  void sale() throws Exception {
        while (number>0){
            TimeUnit.SECONDS.sleep(1);
            this.notifyAll();
            System.out.println(Thread.currentThread().getName()+"卖出第："+
                    number--+"张还剩余"+number+"张");
            this.wait();
        }
    }
}
public class Demo3 {
    public static void main(String[] args) {
        saleTicket  s = new saleTicket();
        new Thread(()->{
        for (int i = 0; i <40 ; i++) {
            try {
                s.sale();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }},"A").start();

        new Thread(()->{
            try {
                for (int i = 0; i <40 ; i++) {
                    s.sale();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i <40 ; i++) {
                try {
                    s.sale();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
    }
}
