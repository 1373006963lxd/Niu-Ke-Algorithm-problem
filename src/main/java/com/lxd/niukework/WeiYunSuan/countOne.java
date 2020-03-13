package com.lxd.niukework.WeiYunSuan;
/*
*
* 求一个数字里面1的个数
*
* */
public class countOne {
    public static int countOne(int m){
        int count = 0;
        if(m<1){
            return 0;
        }
        while(m!=0){
            if((m&1)==1) {
                count++;
                m = m >> 1;
            }else{
                m = m>>1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int M =countOne(5);
        System.out.println(M);
    }
}
