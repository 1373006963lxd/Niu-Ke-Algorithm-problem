package com.lxd.niukework.Sort;

import java.util.Arrays;

//选出最小的元素放在排序数组的最后O（n*n）
public class SelectSort {
    public static void main(String[] args) {
        int[] arr={11,9,3,44,12,98,292,34,522,232};
        System.out.println("选择排序前：");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println("选择排序后：");
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[]arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[y];
                    arr[y] = arr[x];
                    arr[x] = temp;

                }
            }
        }
    }
}
