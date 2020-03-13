package com.lxd.niukework.abstractTest;

public class foosub extends foo {


    //抽象方法必须实现
    @Override
    public void get() {
        System.out.println("继承父类的get方法实现");
    }

    //普通方法被重写后，覆盖父类
    @Override
    public void sava() {
        System.out.println("重写父类foo的save方法");
    }

    public static void main(String[] args) {
        foosub foosub = new foosub();
        foosub.sava();
        foosub.get();
        int m = foosub.n;
        System.out.println("父类中的n="+m);
        //b<s<c<i<l<f<d
        Long n = foosub.L;
        System.out.println("父类中的L"+n);
        int l = foo.l;


    }
}
