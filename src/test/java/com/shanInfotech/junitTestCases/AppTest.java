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
    public void divideTaste() {
    	Calculate div=new Calculate();
    	double result = div.divide(4,5);
    	assertEquals(0.8, result,0.001);
    }
}
