package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        String cont = array[index];
                        array[index] = array[i];
                        array[i] = cont;
                        index++;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}