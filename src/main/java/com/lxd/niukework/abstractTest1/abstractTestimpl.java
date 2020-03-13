package com.lxd.niukework.abstractTest1;

/*
* 抽象方法在实现类中一定被实现*/
public class abstractTestimpl  extends abstractTest{
    @Override
    public int add(int x, int y) {
        return x+y;
    }
}
