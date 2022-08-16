package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int expected = 2;
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int expected = 2;
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxMinus8To10Then10() {
        int expected = 10;
        int left = -8;
        int right = 10;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int expected = 2;
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To2Then2() {
        int expected = 2;
        int one = 2;
        int two = 2;
        int three = 2;
        int result = Max.max(one, two, three);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3To5Then5() {
        int expected = 5;
        int one = 1;
        int two = 3;
        int three = 5;
        int result = Max.max(one, two, three);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To2To2Then2() {
        int expected = 2;
        int one = 2;
        int two = 2;
        int three = 2;
        int four = 2;
        int result = Max.max(one, two, three, four);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3To5To7Then7() {
        int expected = 7;
        int one = 1;
        int two = 3;
        int three = 5;
        int four = 7;
        int result = Max.max(one, two, three, four);
        Assert.assertEquals(result, expected);
    }
}