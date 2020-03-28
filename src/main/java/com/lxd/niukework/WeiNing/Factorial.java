package com.lxd.niukework.WeiNing;

import java.util.Scanner;

/**
 * @auther li xiao dong
 * @date 2020/3/22 0022 下午 17:12
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入n:");
        long n = Long.parseLong(sc.nextLine());
        System.out.println(getFac(n));
    }

    public static long getFac(long n){
        if(n == 1){
            return 1;
        }
        return getFac(n-1)  * n;
    }
}
