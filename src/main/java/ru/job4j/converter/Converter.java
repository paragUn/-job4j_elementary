package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.println(rubleToDollar(180));
        System.out.println(rubleToEuro(140));
    }
}