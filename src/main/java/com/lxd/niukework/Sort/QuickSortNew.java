package com.lxd.niukework.Sort;

public class QuickSortNew {
    public static void main(String[] args) {
        int []arr={12,20,5,16,15,1,2,100,30,45,23,9};
        int low=0;
        int high=arr.length-1;
        quickSort(arr,low,high);
        printSortArr(arr);
    }
    public static void quickSort(int [] arr,int low,int high){
        int start=low;//设置可以移动的最小值
        int end=high;//设置可以移动的最大值
        int key=arr[low];//设置标识
        while(start<end){//整体大循环
            while(start<end&&arr[end]>=key)//先从循环后面的，从后向前，找小于key的
                end--;
            if(arr[end]<=key){
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
            }
            while(start<end&&arr[start]<=key)//循环前面的，从前往后找大于key的值
                start++;
            if(arr[start]>=key){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        //递归调用
        if(low<start)
            quickSort(arr,low,start-1);
        if(end<high)
            quickSort(arr,end+1,high);

    }//打印输出数组
    public static void printSortArr(int []arr){
        StringBuilder res=new StringBuilder();
        res.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                res.append(arr[i]+"]");
            }
            else{
                res.append(arr[i]+",");
            }
        }
        System.out.println(res.toString());
    }
}
