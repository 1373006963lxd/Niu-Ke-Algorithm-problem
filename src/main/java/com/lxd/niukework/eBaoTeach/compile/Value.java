package com.lxd.niukework.eBaoTeach.compile;

class Base1{
    public static int m;
}
public class Value {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Base1 b1 = new Base1();
        b.m = 10;
        b1.m = 20;
        System.out.println(b1.m);

    }

}
