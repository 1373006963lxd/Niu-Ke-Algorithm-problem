package com.lxd.niukework.eBaoTeach.compile;

public class Tux extends Thread {
    static String sName = "vandeler";

    public static void main(String[] args) {
        Tux t = new Tux();
        t.piggy(sName);
        System.out.println(sName);//vandeler
    }

    public void piggy(String sName){
        sName = sName + "wiggy";
        start();
    }

    public void run(){
        for(int i=0;i<4;i++){
            sName = sName+ " "+i;
        }
    }
}
