package com.lxd.niukework.Array;
/*
* 第二种找倒数第k个元素的方法--------借助快速排序
*
* */
public class FindDaoShuKelementOfArray2 {

    public static int quickSortElment(int[] array,int low,int high,int k){
        int i = low;
        int j = high;
        int index = array[i];//基准值这里需要注意第一次可以是array[0],后面在排序就是分段的第一个元素
        while (i<j){
            while (i<j&&array[j]>=index){
                j--;
            }
             if(i<j){
                array[i++] = array[j];
            }
             while(i<j&&array[i]<index){
                 i++;
             }
             if(i<j){
                 array[j--] = array[i];
             }
        }
        array[i] = index;
        if(i==k-1){
            return index;
        }
        if(i>k-1){
           return quickSortElment(array,low,i-1,k);
        }else{
             return  quickSortElment(array,i+1,high,k);
        }
    }

    public static int getKMin(int[] array,int k ){
        if(array==null){
            return Integer.MIN_VALUE;
        }
        if(array.length<k){
            return Integer.MAX_VALUE;
        }
        return quickSortElment(array,0,array.length-1,k);
    }

    public static void main(String[] args) {
        int[] a = {1,5,2,6,8,0,6};
        int kMin = getKMin(a,3);
        System.out.println(kMin);
    }
}
