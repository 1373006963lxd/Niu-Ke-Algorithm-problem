package com.lxd.niukework.WeiNing;

/**
 * @auther li xiao dong
 * @date 2020/3/22 0022 下午 17:08
 */
public class StringTest {
    public static void main(String[] args) {
        String word = "Hello";
        getWho(word);
        System.out.println(word);
    }

    public static void getWho(String word) {
        word = word + " world";
    }
}
