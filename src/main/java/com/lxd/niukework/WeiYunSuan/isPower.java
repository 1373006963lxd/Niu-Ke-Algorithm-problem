package com.lxd.niukework.WeiYunSuan;

public class isPower {
    public static boolean isPower(int m) {
        if (m < 1) {
            return false;
        }
        if ((m & (m - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPower(4));
        System.out.println(isPower(6));
    }
}
