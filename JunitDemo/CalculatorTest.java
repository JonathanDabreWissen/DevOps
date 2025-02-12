package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	void testAdd() {
		Calculator c1 = new Calculator();
		assertEquals(30, c1.add(10, 20), ()->"Sum result is not right");
		assertEquals(50, c1.add(30, 20), ()->"Sum result is not right");
		assertEquals(-10, c1.add(10, -20), ()->"Sum result is not right");
	}
	
	@Test
	void testDiv() throws ArithmeticException {
		Calculator c1 = new Calculator();
		assertEquals(2, c1.div(10,5));
		assertThrows(ArithmeticException.class, ()->c1.div(90,0));
	}
}
