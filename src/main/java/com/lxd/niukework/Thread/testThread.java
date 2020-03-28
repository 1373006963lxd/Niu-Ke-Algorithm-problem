package com.lxd.niukework.Thread;

/**
 * @auther li xiao dong
 * @date 2020/3/18 0018 下午 18:53
 */
class Resource{

    private volatile int num=0;
    public void add() {
        num++;
        System.out.println(Thread.currentThread().getName()+":"+num);
    }
}
public class testThread {
    public static void main(String[] args) {
        Resource resource = new Resource();
        new Thread(()->{
            for(int i=0;i<10;i++){
            resource.add();}
        },"AA").start();
        new Thread(()->{
            for(int i=0;i<10;i++){
            resource.add();}
        },"BB").start();
    }
}
