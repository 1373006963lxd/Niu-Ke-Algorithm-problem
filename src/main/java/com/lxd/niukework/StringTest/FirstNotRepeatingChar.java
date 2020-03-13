package com.lxd.niukework.StringTest;

import java.util.LinkedHashMap;

/**
 * @auther li xiao dong
 * @date 2020/3/13 0013 下午 22:38
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        //for (String s : map.keySet()) {遍历key
        //    System.out.println("key:" + s + "," + "value:" + map.get(s));
        //}
        LinkedHashMap<Character,Integer> link = new LinkedHashMap<>();
        int len = str.length();
        for(int i=0;i<len;i++){
            if(link.containsKey(str.charAt(i))){
                int currentTime = link.get(str.charAt(i));
                link.put(str.charAt(i),currentTime+1);
            }else{
                link.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            if(link.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}
