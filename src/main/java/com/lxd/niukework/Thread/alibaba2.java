package com.lxd.niukework.Thread;

import java.util.Scanner;

/**
 * @auther li xiao dong
 * @date 2020/3/17 0017 下午 21:48
 */

/*
* 输入数字n，创建n个线程，第i个线程打印字符串“number i” ，循环打印100次
*
*
*
* */
class MyThread extends Thread {
    private  int n;
    public MyThread(int n){
        this.n = n;
    }
    public void run() {
        System.out.println("number"+":"+n);
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
public class alibaba2 {
    public static void main(String[] args) throws InterruptedException {
        //输入数字n
        Scanner scanner = new Scanner(System.in);
        int threadCount = scanner.nextInt();
        scanner.close();
        int j = 0;
        for(j=0;j<100;j++){
            //创建n个线程
        for(int i=0;i<threadCount;i++) {
            Thread thread = new MyThread(i);
            thread.start();
            //保证线程有顺序
            thread.join();
        }
        System.out.println("================================"+j);
        }

    }
}
