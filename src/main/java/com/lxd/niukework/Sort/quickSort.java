package com.lxd.niukework.Sort;

import java.util.Arrays;

/*
*
* 快速排序
*
* */
public class quickSort {
    public static void sort(int array[],int low,int high){
        int i;
        int j;
        int index;
        if(low>high){
            return;
        }
        i = low;
        j = high;
        index = array[low];//取左边的值为基准值
        while(i<j){
            while(i<j&&array[j]>index){
                j--;
            }
            if(i<j){//从右边找到小于基准的值，则与右边的互换
                array[i++]=array[j];
            }
            while(i<j&&array[i]<index){
                i++;
            }
            if(i<j){//从左边找到大于基准的值，则与左边的互换。
                array[j--]=array[i];
            }
        }
        array[i] = index;//基准值的位置
        sort(array,low,i-1);
        sort(array,i+1,high);
    }

    public static void main(String args[]){
        int []arr={12,20,5,16,15,1,2,100,30,45,23,9};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
