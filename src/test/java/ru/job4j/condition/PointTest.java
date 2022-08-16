package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when19to84then8dp6() {
        double expected = 8.6;
        Point point1 = new Point(1, 9);
        Point point2 = new Point(8, 4);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to22then2() {
        double expected = 2;
        Point point1 = new Point(2, 0);
        Point point2 = new Point(2, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}