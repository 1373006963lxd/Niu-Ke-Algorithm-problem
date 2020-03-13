package com.lxd.niukework.WeiYunSuan;

public class MPowerN {
    public static int powerN(int m,int n){//m乘以2的n次方
        for(int i=0;i<n;i++){
            m = m<<1;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(powerN(3,3));
    }
}
