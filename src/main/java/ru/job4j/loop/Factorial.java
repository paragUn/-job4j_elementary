package ru.job4j.loop;

public class Factorial {
    public static int calc(int number) {
        int result = 1;
        for (int index = 1; index <= number; index++) {
                result *= index;
        }
        return result;
    }
}
