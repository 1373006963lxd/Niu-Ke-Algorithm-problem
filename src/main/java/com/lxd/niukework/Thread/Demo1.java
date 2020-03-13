package com.lxd.niukework.Thread;



class Ticket{
    private int number = 1000;
    public synchronized void sale(){
        if(number>0){
            System.out.println(Thread.currentThread().getName()+"\t卖出第"+(number--)+"张"+
                    "\t还剩余"+number+"张票"
                    );
        }else{
            System.out.println("已经没有票可以出售");
        }

    }
}
public class Demo1 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<40;i++) {
                    ticket.sale();
                }
            }

        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<40;i++){
                    ticket.sale();
                }
            }
        },"B").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <40 ; i++) {
                    ticket.sale();
                }
            }
        },"C").start();
    }
}
