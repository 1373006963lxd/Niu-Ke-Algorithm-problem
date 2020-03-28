package com.lxd.niukework.WeiNing;

/**
 * @auther li xiao dong
 * @date 2020/3/22 0022 下午 17:02
 */
public class Second extends First{
    public Second(){
        aMethod();
    }
    public void aMethod(){
        System.out.println("in second class");
    }
    public static void main(String[] args){
        new Second();
    }
}
class First{
    public First(){
        aMethod();
    }
    public void aMethod() {
        System.out.println("in first class");
    }
}