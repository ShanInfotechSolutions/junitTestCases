package com.shanInfotech.junitTestCases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
	int i=10;

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
        assertTrue(true,String.valueOf(i));
    }
}
