package com.lxd.niukework.Sort;

import java.util.Arrays;
/**
 * **归并排序（理解描述）**:
 * 思想：
 * 1.对原始序列arr进行一半分割，设置原始序列的第一个索引low和最后一个索引值high，并创建临时序列
 * 2.求出原始序列的中间索引mid=(low+high)/2，根据mid对序列分割
 * 3.判断low是否小于high，满足则递归调用步骤1和2，一直对分割的序列再分割，直到剩余一个元素为止
 * 4.对分割的序列分别根据其索引指向的元素值进行比较，小的则放入临时序列中，各序列索引加1、、
 * 5.对剩余没有加入到临时序列中的元素直接添加到临时序列的最后的位置
 * 6.将临时序列赋值给原始序列，此时原始序列就是已经排好序的序列
 * @author lpq
 *
 */

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("排序前：");
        int[] arr = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));
    }

    //切分原始数组
    public static void mergeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;//将序列按中间分开

        if (low < high) {
            //分开左边
            mergeSort(arr, low, mid);
            //右半边
            mergeSort(arr, mid + 1, high);
            //将左右已经排序好的合并
            merge(arr, low, mid, high);
        }

    }

    public static void merge(int[] arr, int low, int mid, int high) {
        /**
         * 这里的start和end分别是左半边序列和右半边序列的其实指针，分别指向各半边序列的第一个位置，随着的元素的比较而发生改变
         * 而low和high是不发生改变的，一般来说low指的是序列的第一个索引0即low=0，high=arr.lenth-1,
         * low和length值不发生改变
         */
        //临时数组（序列）
        int[] temp = new int[high - low + 1];
        //左半边序列的指针（一般指向第一个位置low）
        int start = low;
        //右半边序列的指针
        int end = mid + 1;
        //临时数组序列的索引
        int k = 0;
        //把小的元素加入到临时数组中
        while (start <= mid && end <= high) {
            if (arr[start] < arr[end])
                temp[k++] = arr[start++];
            else
                temp[k++] = arr[end++];
        }
        //把左边剩余元素加入到临时数组的后面
        while (start <= mid)//这里不能用if判断，因为if只能判断一次，while只要满足条件就会一直循环判断下去
            temp[k++] = arr[start++];
        //把右半边剩余元素加入到临时数组的后面
        while (end <= high)
            temp[k++] = arr[end++];
        //将排序好的临时数组复制给原始数组arr
        for (int i = 0; i < temp.length; i++) {
            arr[i+low] = temp[i];
        }
    }
}
