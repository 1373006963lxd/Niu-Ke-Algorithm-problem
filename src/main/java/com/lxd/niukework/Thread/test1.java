package com.lxd.niukework.Thread;

import java.util.Scanner;

/**
 * @auther li xiao dong
 * @date 2020/3/18 0018 下午 19:12
 */
class Resources{
    public  void print(int n){
        System.out.println("number"+":"+n);
    }
}
public class test1 {
    public static void main(String[] args) {
        Resources resources = new Resources();
        Scanner scanner = new Scanner(System.in);
        int threadCount = scanner.nextInt();
        scanner.close();
        for(int k=0;k<100;k++) {
            for (int i = 0; i < threadCount; i++) {
                int j = i;
                new Thread(() -> {
                    resources.print(j);
                }).start();
            }
        }
    }
}
