package com.lxd.niukework.Array;
/*
* 一个数组循环右移k位
*
* */
public class CircleRightK {
    public static void reverse(int a[],int low,int high){
        for( ;low<high;low++,high--){
            int tmp = a[low];
            a[low] = a[high];
            a[high] = tmp;
        }
    }
    public static void shift_k(int a[],int k){
        int n = a.length;
        k = k%n;//为了防止逆序的k过大，结果是一样的
        reverse(a,0,n-k-1);//右半部分逆序
        reverse(a,n-k,n-1);//左半部分逆序
        reverse(a,0,n-1);//整体逆序
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        shift_k(a,2);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

