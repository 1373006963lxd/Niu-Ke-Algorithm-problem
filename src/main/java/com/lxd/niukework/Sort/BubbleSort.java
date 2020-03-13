package com.lxd.niukework.Sort;
/*
* 冒泡排序
*
* 一共进行n轮比较
* 每一轮都会使得最大的数字在在最后
* 这样进行第二次排序的时候就可以排除最后一个然后
* 从头到排除最后一个的前一个再选出最大的一个
*
* */
public class BubbleSort {
    public static void BubbleSort(int array[]){
        int len = array.length;
        int tmp;
        for(int i=0;i<len-1;i++){//这是进行n轮的比较
            for(int j=1;j<len-i;j++){//每一轮比较都是从1开始，然后冒泡出最后一个，直到剩下一个
                if(array[j]<array[j-1]){
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a ={5,4,9,8,7,6,0,1,3,2};
        BubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
