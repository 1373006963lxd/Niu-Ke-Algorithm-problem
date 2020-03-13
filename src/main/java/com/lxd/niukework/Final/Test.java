package com.lxd.niukework.Final;

public class Test {
    //在定义时初始化
    final  String str="lxd";
    {
         final int m = 10 ;
    }
    static {
          final int n = 20;
    }

    Test(){
        final  int s = 20;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
