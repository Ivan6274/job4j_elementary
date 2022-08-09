package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int expected = 2;
        Assert.assertEquals(Max.max(1, 2), expected);
    }

    @Test
    public void whenMax2To33ToMinus1Then33() {
        int expected = 33;
        Assert.assertEquals(Max.max(2, 33, -1), expected);
    }

    @Test
    public void whenMax0To3To16To22Then22() {
        int expected = 22;
        Assert.assertEquals(Max.max(0, 3, 16, 22), expected);
    }

    @Test
    public void whenMax0To16To16To4Then16() {
        int expected = 16;
        Assert.assertEquals(Max.max(0, 16, 16, 4), expected);
    }
}