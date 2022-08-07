package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (++start; start <= finish; start++) {
            if (array[start] < min) {
                min = array[start];
            }
        }
        return min;
    }
}
