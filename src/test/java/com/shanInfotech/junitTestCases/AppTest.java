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
    	double res = div.divide(5,5);
    	assertEquals(1.0, res,0.001);
    }
}
