package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result   = Point.distance(0, 0, 2, 0);
        double result2  = Point.distance(1, 9, 8, 4);
        double result3  = Point.distance(2, 0, 2, 2);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 9) to (8, 4) " + result2);
        System.out.println("result (2, 0) to (2, 2) " + result3);
    }
}