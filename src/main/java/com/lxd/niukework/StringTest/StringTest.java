package com.lxd.niukework.StringTest;

public class StringTest {
    /*
    * 引用变量存放在栈中，对于字符串常量则引用直接存放的是常量池中字符串常量的地址
    * 对于new 的字符串则栈中存放的是堆中的地址，堆中存放的是字符串常量的地址
    * */
    public static void main(String[] args) {
        String a = "a" + "b";
        String b = "ab";
        System.out.println(a==b);
        String c = "a";
        String d = "b";
        System.out.println(b==c+d);
        System.out.println(a==c+d);
        String e = new String("abc");
        String f = new String("abc");
        String g = "abc";
        System.out.println(e==f);
        System.out.println(e.equals(f));
        System.out.println(e.equals(g));
        System.out.println(e==g);

    }

}
