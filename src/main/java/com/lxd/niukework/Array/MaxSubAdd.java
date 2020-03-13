package com.lxd.niukework.Array;

public class MaxSubAdd {

    public static int maxSubArrayAdd(int arr[]){
        int n = arr.length;
        int thisSum = 0;
        int maxSum = 0;
        for(int i=0;i<n;i++){//外面两层循环相当于窗口锁定数据
            for(int j=i;j<n;j++){
                thisSum=0;
                for(int k =i;k<j;k++){//这层循环就是求窗口里面数据的和，找到最大的和
                    thisSum+=arr[k];
                    if(thisSum>maxSum){
                        maxSum = thisSum;
                    }
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,4,8,-4,7};
        System.out.println(maxSubArrayAdd(arr));
    }
}
