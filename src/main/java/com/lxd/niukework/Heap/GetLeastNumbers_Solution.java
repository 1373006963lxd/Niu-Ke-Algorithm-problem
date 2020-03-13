package com.lxd.niukework.Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @auther li xiao dong
 * @date 2020/3/14 0014 上午 1:34
 */
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int len = input.length;
        ArrayList<Integer> list = new ArrayList<>();
        if(k>len||k==0){
            return list;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int i=0;i<len;i++){
            if(queue.size()<k){
                queue.add(input[i]);
            }else{
                if(input[i]<queue.peek()){
                    queue.poll();
                    queue.add(input[i]);
                }
            }
        }
        while(queue.size()!=0){
            list.add(0,queue.peek());
            queue.poll();
        }
        return list;
    }
}
