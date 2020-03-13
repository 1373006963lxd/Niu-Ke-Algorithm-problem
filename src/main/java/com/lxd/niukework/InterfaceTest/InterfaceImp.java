package com.lxd.niukework.InterfaceTest;

public class InterfaceImp implements InterfaceTest {

    @Override
    public void get() {
        System.out.println("必须实现接口中的成员方法（默认被public static修饰）");
    }

    public  void save(){

    }

    public static void main(String[] args) {
        InterfaceTest imp = new InterfaceImp();
        imp.get();

    }
}
