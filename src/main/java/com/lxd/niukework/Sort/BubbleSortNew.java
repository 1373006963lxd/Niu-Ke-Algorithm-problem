package com.lxd.niukework.Sort;

import java.util.Arrays;

public class BubbleSortNew {
    public static void main(String[] args) {
        System.out.println("排序前：");
        int[] arr={51, 46, 20, 18, 65, 97, 82, 30, 77, 50,2,33,12,100 };
        System.out.println(Arrays.toString(arr));
        System.out.println("排序后：");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[]arr){
        for(int x=0;x<arr.length-1;x++){
            for(int y=0;y<arr.length-1-x;y++){
                if(arr[y]>arr[y+1]){
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }

        }
    }
}
