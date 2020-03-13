package com.lxd.niukework.eBaoTeach.compile;

public class Selby {
    int i=0;

    public static void main(String[] args) {
    }
    Selby() {
            top:
            while (i < 2) {
                System.out.println(i);//Compilation but no output at runtime
                i++;
                continue top;
            }
    }
}
