package com.lxd.niukework.eBaoTeach.compile;

class Base{
    public static int iAge;
}
public class CSturt {
    public static void main(String[] args) {
        CSturt cs = new CSturt();
        cs.ww();
    }

    public void ww(){
        Base b = new Base();
        Base b2 = new Base();
        b.iAge = 10;
        b2.iAge = 20;
        System.out.println(b.iAge);//20
        Integer iw = new Integer(b.iAge);
        col(iw);//20
    }

    public static void col(Object o){
        Integer iw = (Integer) o;
        System.out.println(iw.intValue());
    }
}
