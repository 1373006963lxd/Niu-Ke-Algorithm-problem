package com.lxd.niukework.HashMapKeyObject;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyObject {


    public static void main(String[] args) {
        Map<People,Integer> map = new HashMap<People, Integer>();
        map.put(new People("liu",18),5);
        map.put(new People("cheng",22),1);
        People p = new People(
                "liu",18);
        People p1 = new People("cheng",22);
        System.out.println(map.get(p));
        System.out.println(map.get(p1));
    }
}
   /* class People{
        private String name;
        private int age;

        public People(){

        }
        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
*/