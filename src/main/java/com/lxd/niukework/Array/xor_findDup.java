package com.lxd.niukework.Array;
/*
*
* 有n个数字，其中这n个数字都是1-（n-1） 其中只有一个数字是重复的所以
* 找出那个重复的数字
*
*另一种思路：直观：将数组中所有的数字相加  再将这个结果减去1-（n-1）的和，最总就是剩下的就是重复的数字
* */
public class xor_findDup {
    public static int xor_findDup(int a[]){
        int len = a.length;
        int result = 0;
        for(int i=0;i<len;i++){//先让数组中所有的数字进行异或操作，这样就会使得最后的结果中不包括重复的那个数字
            result^=a[i];
        }
        for(int i=1;i<len;i++){//然后将最总的结果与数字所在的范围的每一个数字进行异或操作，这样最后只有那个没有的数字的结果
            result^=i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,4};
        int result = xor_findDup(a);
        System.out.println(result);
    }
}
