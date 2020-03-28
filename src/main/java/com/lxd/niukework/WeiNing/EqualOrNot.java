package com.lxd.niukework.WeiNing;

/**
 * @auther li xiao dong
 * @date 2020/3/22 0022 下午 17:06
 */
public class EqualOrNot {

    public static void main(String[] args){
        B b1 = new B(5);
        B b2 = new B(5);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
class B{
    int x;
    B(int y){
        x=y;
    }
}
