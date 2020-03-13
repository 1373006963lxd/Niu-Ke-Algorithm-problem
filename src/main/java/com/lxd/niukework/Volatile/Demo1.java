package com.lxd.niukework.Volatile;


class Add{
    private  volatile int number = 0;
    public /*synchronized*/ void add(){
        number++;
        System.out.println(Thread.currentThread().getName()+"打印"+number);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Add add = new Add();
        for (int i = 0; i < 3505; i++) {
            new Thread(() -> {
                add.add();
            }, "A"+i).start();
        }
    }
}
