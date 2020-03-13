package com.lxd.niukework.eBaoTeach.compile;


/*
*
* 只能访问方法中定义为final类型的局部变量
*
* */
public class Test {
    public static void print(String str){
        TestInterface testInterface = new TestInterface() {
            @Override
            public String add() {
                return /*str+*/"Tech";//  编译时错误  compiler time error
            }
        };
        str = testInterface.add();
    }

    public static void main(String[] args) {
        String str = "eBao";
        Test.print(str);
        System.out.println(str);
    }
}
