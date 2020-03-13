package com.lxd.niukework.abstractTest;

public  abstract  class foo {

   private String name;

   public Long L = 102033L;

   protected  int n = 10;

   //被final修饰后一定要初始化
   public static final int l = 20;

   //abstract不能够修饰属性（可以修饰类和方法）
  /* public  abstract int m = 200;*/

   public static String s;


   //抽象方法（没有方法体）
   public abstract void get();

   //普通方法
   public void sava(){
      System.out.println("foo抽象类中的普通方法");
   }

   /*
   * 抽象类中可以有自己的非抽象的成员方法
   * */
   public static void set(){

   }


   /*只要是抽象方法都不能被private，static，synchronized,native 修饰
   * 所以接口中的方法都不能被这些修饰
   * 抽象类中不被abstract修饰的方法可以修饰
   *
   * */
   /*private abstract void get();*/
}

