package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] currentArray : array) {
            for (int currentNum : currentArray) {
                result += currentNum;
            }
        }
        return result;
    }
}