package com.shanInfotech.junitTestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	@Test
    public void shouldMultiplyCorrectly() {
        Calculate calc = new Calculate();
        double result = calc.multiply(4, 5);
        assertEquals(20.0, result, 0.001); // delta is optional for integers
    }

    @Test
    public void shouldMultiplyWithZero() {
        Calculate calc = new Calculate();
        double result = calc.multiply(0, 10);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void shouldMultiplyWithNegative() {
        Calculate calc = new Calculate();
        double result = calc.multiply(-3, 6);
        assertEquals(-18.0, result, 0.001);
    }
}
