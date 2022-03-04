package com.lxd.niukework.MultiState;

public class Triangle extends Figure {
    Triangle(double d1, double d2) {
        super(d1, d2);
    }
    double area() {
        System.out.println("三角形的面积：");
        return super.dim1 * super.dim2 / 2;
    }
}