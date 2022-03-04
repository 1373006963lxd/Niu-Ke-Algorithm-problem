package com.lxd.niukework.MultiState;

public class Rectangle extends Figure {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }
    double area() {
        System.out.println("长方形的面积：");
        return super.dim1 * super.dim2;
    }
}