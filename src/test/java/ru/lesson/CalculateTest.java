package ru.lesson;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void testAdd() throws Exception {
        Calculate calc = new Calculate();
        calc.add(1, 1);
        Assert.assertEquals(2, calc.getResult());
    }
}