package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] currentArray : array) {
            for (int currentNum : currentArray) {
                rsl += currentNum;
            }
        }
        return rsl;
    }
}