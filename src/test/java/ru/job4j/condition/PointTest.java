package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to40then4() {
        double expected = 4;
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when50to00then5() {
        double expected = 5;
        Point a = new Point(5, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when004to025then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, 0, 4);
        Point b = new Point(0, 2, 5);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00minus4to026then10dot2() {
        double expected = 10.2;
        Point a = new Point(0, 0, -4);
        Point b = new Point(0, 2, 6);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when100minus2to0minus28then14dot28() {
        double expected = 14.28;
        Point a = new Point(10, 0, -2);
        Point b = new Point(0, -2, 8);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}