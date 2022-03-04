package com.lxd.niukework.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTopK {//
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,1,23,56,123};
        int res = getKmax(arr, 4);
        System.out.println(res);

    }
    public static int getKmax(int[] arr,int k){
        PriorityQueue<Integer> queue = new PriorityQueue(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i=0;i<arr.length;i++){
            if(i<k){
                queue.add(arr[i]);
            }else{
                int temp = queue.peek();
                if(temp>arr[i]){
                    queue.poll();
                    queue.add(arr[i]);
                }
            }
        }
       return queue.peek();
    }
}
