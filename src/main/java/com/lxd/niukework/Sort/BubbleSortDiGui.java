package com.lxd.niukework.Sort;

import java.util.Arrays;
        /*冒泡排序算法的运作如下：（从后往前）
        1)比较相邻的元素。如果第一个比第二个大，就交换他们两个。
        2)对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
        3)针对所有的元素重复以上的步骤，除了最后一个。
        4)持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。*/
public class BubbleSortDiGui {
    public static void main(String[] args) {
        System.out.println("排序前：");
        int[] arr={51, 46, 20, 18, 65, 97, 82, 30, 77, 50,2,33,12,100 };
        System.out.println(Arrays.toString(arr));
        System.out.println("排序后：");
        bubbleSort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[]arr,int end){
            for (int y = 0; y < end-1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
            if(--end>0) {
                bubbleSort(arr, end);
            }
        }
}
