package com.lxd.niukework.MapBianLi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorMapEntry {
        public static void main(String[] args) {
            // 创建并赋值 HashMap
            Map<Integer, String> map = new HashMap();
            map.put(1, "Java");
            map.put(2, "JDK");
            map.put(3, "Spring Framework");
            map.put(4, "MyBatis framework");
            map.put(5, "Java中文社群");
            // 遍历
            Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, String> entry = iterator.next();
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
}
