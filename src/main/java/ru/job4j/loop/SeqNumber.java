package ru.job4j.loop;

public class SeqNumber {
    public static void main(String[] args) {
        calc(6);
        calc(5);
        calc(3);
    }

    public static void calc(int number) {
        int hold = 0;
        for (int index = 1; index <= number; index++) {
            hold += index;
            System.out.println(hold);
            if (hold == number) {
                System.out.println("N = " + number + ". Success");
                break;
            } else if (hold > number) {
                System.out.println("N = " + number + ". Not possible");
                break;
            }
        }
    }
}
