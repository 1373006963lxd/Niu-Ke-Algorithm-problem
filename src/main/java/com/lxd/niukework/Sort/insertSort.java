package com.lxd.niukework.Sort;
/*
*
*
*
* 插入排序
*
*
*
* */
public class insertSort {
    public static void insertSort(int[] arr){
        if(arr!=null){
            for(int i=1;i<arr.length;i++){
                int j = i;
                int tmp = arr[i];
                if(arr[j-1]>tmp){
                while(j>=1&&arr[j-1]>tmp) {
                    arr[j] = arr[j - 1];
                    j--;
                 }
                }
                arr[j] = tmp;
            }
        }
    }


    public static void insertionSort(int a[]) {
             //插入排序算法
              int i,j,key,n=a.length;       //key值存储当前比较中最小的值
              for(j=1;j<n;j++){
                      key=a[j];                 //key<-a[j]
                      i=j-1;                    //i=j-1表示从当前有序数组最后一个元素开始算
                      while(i>=0&&a[i]>key){
                              //当还未到达数组的起始并且当前元素大于要插入的数key,则i值与后一位进行交换,并且i值减小
                             //这可以保证大于key的所有元素依次向末尾方向移动一位
                              //保证，key到达的位置前面没有大于key的元素，后面也没有小于key
                              //这就是插入排序算法的思想
                              a[i+1]=a[i];//如果有大于当前的值的，则当前的位置的值就是这个大于当前要插入的值，并且还保证了后移一个位置
                              i--;
                          }
                      a[i+1]=key;//到了小于要插入的值的时候，则这个位置的值的后面就是要插入值的位置
                  }
             }

    public static void main(String[] args) {
        int[] array = {7,3,19,40,4,7,1};
        insertionSort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
