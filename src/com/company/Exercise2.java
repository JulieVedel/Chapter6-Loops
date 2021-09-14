package com.company;

public class Exercise2 {
    public static void main(String[] args) {
        squareRoot(16);

    }
    public static void squareRoot(double a) {
        double x0 = a / 2;
        double x1 = (x0 + a / x0) / 2;
        while (x1 > Math.sqrt(a)) {
            System.out.println(Math.abs(x1));
            double x2 = (x1 + a / x1) / 2;
            x1 = x2;
        }
        System.out.println(Math.sqrt(a));
    }
}
