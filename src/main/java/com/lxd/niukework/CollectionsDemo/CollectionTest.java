package com.lxd.niukework.CollectionsDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionTest {

   private static Logger   logger = LoggerFactory.getLogger(CollectionTest.class);
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(5);
        int i = Collections.binarySearch(list, 10);
        System.out.println(i);
        Collections.sort(list);
        logger.info("==============================================");
        for (int j = 0; j <list.size() ; j++) {
            System.out.println(list.get(j));
        }
    }
}
