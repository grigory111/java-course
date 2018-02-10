package ru.lesson;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void testAdd() throws Exception {
        Calculate calc = new Calculate();
        calc.add(1, 1);
        Assert.assertEquals(2, calc.getResult(), 1e-4);
    }

    @Test
    public void testDev() throws Exception {
        Calculate calc = new Calculate();
        calc.div(1, 3);
        Assert.assertEquals(0.3333, calc.getResult(), 1E-4);
    }


    @Test (expected = MyException.class)
    public void testAddException() throws Exception {
        Calculate calc = new Calculate();
        calc.add();
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDevException() throws Exception {
        Calculate calc = new Calculate();
        calc.div(9, 0);
    }
}