package com.lxd.niukework.Sort;

import java.util.Arrays;
/*二分查找也称折半查找（Binary Search），它是一种效率较高的查找方法。但是，折半查找要求线性表必须采用顺序存储结构，而且表中元素按关键字有序排列。
        注意：二分查找前提条件是：该序列有序*/
public class BinarySerch {
    public static void main(String[] args) {
        //int []arr={11,22,33,44,55,66,77};
        int [] arr = {1};
        if(arr.length<1){
            return;
        }
        Arrays.sort(arr);//对数组排序
        System.out.println(binarySerch(arr,56));
    }
    public static int binarySerch(int[]arr,int value){
        int min=0;
        int max=arr.length-1;
        int mid=(min+max)/2;
        while(arr[mid]!=value){
            if(arr[mid]>value){
                max=mid-1;
            }
            else if(arr[mid]<value){
                min=mid+1;
            }
            mid=(min+max)/2;
            if(min>max){
                return -1;//说明数组为空或所查找元素不存在
            }
        }
        return mid;
    }
}
