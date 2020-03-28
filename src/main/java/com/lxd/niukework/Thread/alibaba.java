package com.lxd.niukework.Thread;

import java.util.Scanner;

/**
 * @auther li xiao dong
 * @date 2020/3/17 0017 下午 16:07
 */
public class alibaba {
        private static int count = 0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int threadCount = scanner.nextInt();
            scanner.close();
            for(int i = 0 ; i < threadCount ; i++){
                Thread thread = new PrintNumThread(i);
                thread.start();
            }
        }

        static class PrintNumThread extends Thread{

            private int n;

            public PrintNumThread(int n){
                this.n = n;
            }
            public void run()
            {
                try {
                            System.out.println(Thread.currentThread().getName()+":"+n);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
