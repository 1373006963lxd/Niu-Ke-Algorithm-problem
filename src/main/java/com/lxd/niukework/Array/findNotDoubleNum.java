package com.lxd.niukework.Array;
/*
*
* 找出数组中只有一个是一个数字，其他都是重复的两个
*
*思路：进行异或操作，这样相同的数字就变了0，最后剩下的只有那一个数字
* */
public class findNotDoubleNum {
    public static int findNotDoule(int arr[]){
        int len = arr.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            result = arr[i]^result;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,1,5,2,2,3,3,4,4};
        int num = findNotDoule(arr);
        System.out.println(num);
    }
}
