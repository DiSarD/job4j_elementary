package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short height = 187;
        double man = Fit.manWeight(height);
        double expected = 100.05;
        double delta = 0.001;
        assertEquals(expected, man, delta);
    }

    @Test
    public void womanWeight() {
        short height = 187;
        double man = Fit.womanWeight(height);
        double expected = 88.55;
        double delta = 0.001;
        assertEquals(expected, man, delta);
    }
}