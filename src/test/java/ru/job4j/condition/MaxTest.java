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
}