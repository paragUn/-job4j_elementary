package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when19to84then8dp6() {
        double expected = 8.6;
        int x1 = 1;
        int y1 = 9;
        int x2 = 8;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to22then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}