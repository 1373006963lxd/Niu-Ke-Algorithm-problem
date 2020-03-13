package com.lxd.niukework.Array;
/*
* 最直接方法
*
* */
public class FindDaoShuKelementOfArray {
    public static int findElment(int[] array,int k){
        if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        for(int i=1;i<array.length;i++){
            if(array[i-1]>array[i]){
                int tmp = array[i-1];
                array[i-1] = array[i];
                array[i] = tmp;
            }
        }
        return array[array.length-k];
    }


    public static void main(String[] args) {
        int[] a = {2,3,5,1,9,8,10};
        System.out.println(findElment(a,3));

    }
}
