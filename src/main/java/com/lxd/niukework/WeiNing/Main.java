package com.lxd.niukework.WeiNing;

import java.util.Scanner;

/**
 * @auther li xiao dong
 * @date 2020/3/22 0022 下午 19:42
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] A = s.split(" ");
        int num[] = new int[A.length];
        int len = A.length;
        for(int i=0;i<len;i++){
            num[i] = Integer.parseInt(A[i]);
        }
        int flag = -1;
        for(int i=0;i<len-1;i++){
            if(num[i+1]<num[i]){
                flag=0;
            }
        }
        if(flag==-1){
            System.out.print(flag);
        }
        for(int i=0;i<len;i++){
            int count = 0;
            for(int j=i-1;j>=0;j--){
                if(num[j]>num[i]) {
                    count++;
                }
            }
            if(count==1){
                System.out.print(i);
                System.out.print(' ');
            }
        }
    }
}
