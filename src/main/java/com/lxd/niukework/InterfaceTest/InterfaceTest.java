package com.lxd.niukework.InterfaceTest;

/*
* 接口中的方法都是抽象方法，所以都没有方法体
* */
public interface InterfaceTest {


    //被final修饰后一定要（初始化）
    /*因为接口中的成员变量都默认是public static final 所以都必须初始化*/


    public static final int n = 10;
    //接口中定义的常量默认为public static final
    public String s = "hello";

    /*成员方法默认被public abstract 修饰
    * 接口中的方法不能被static修饰
    *
    *
    * */
    public void get();



}

