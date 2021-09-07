package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K6Square15() {
        double expected = 1.5;
        int p = 7;
        double k = 6;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K9Square1102() {
        double expected =  1.102;
        int p = 7;
        double k = 9;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

}