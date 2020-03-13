package com.lxd.niukework.abstractTest1;

/*
*
* 抽象类中的抽象方法没有方法体
* 非抽象方法可以有方法体
* 有抽象方法类必须是抽象类
* */
public abstract class abstractTest {

    public void say(){
        System.out.println("lxd");
    }

    public abstract int add(int x,int y);

}
