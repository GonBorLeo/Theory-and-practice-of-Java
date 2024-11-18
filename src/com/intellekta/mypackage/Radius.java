package com.intellekta.mypackage;

public class Radius {
    public static double getSquare(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.pow(Math.PI * radius, 2);
    }
}
