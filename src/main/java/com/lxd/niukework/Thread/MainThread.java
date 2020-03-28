package com.lxd.niukework.Thread;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther li xiao dong
 * @date 2020/3/18 0018 下午 12:33
 */
public class MainThread {
    //定义锁
    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws Exception {
        //所有线程
        ArrayList<Thread> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //所有信号量
        ArrayList<Condition> conlist = new ArrayList<>();
        boolean[] flag = new boolean[n];
        //n个线程就有n个信号量
        for (int i = 0; i < n; i++) {
            conlist.add(lock.newCondition());
        }
            for (int i = 0; i < n; i++) {
                final int j = i;
                list.add(new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            lock.lock();
                            int c = j;
                            if (c > 0) {
                                //while条件限制
                                while (!flag[c]) {
                                    conlist.get(j).await();
                                }

                            }
                            System.out.println(c + 1);

                            if (c + 1 < n) {
                                flag[c + 1] = true;//一种标识，类似生产消费模型的数量标识
                                conlist.get(c + 1).signal();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            lock.unlock();
                        }
                    }
                }));
            }
        for (int i = 0; i < n; i++) {
            list.get(i).start();
        }
    }

}
