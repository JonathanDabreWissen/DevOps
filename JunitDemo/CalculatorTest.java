package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator c1 = null;
	
	@BeforeAll
	static void createCalculator() {
		c1 = new Calculator();
		System.out.println("-----------Started--------------");
	}
	
	
	@AfterAll
	static void removeCalculator() {
		c1 = null;
		System.out.println("-----------Finished--------------");
	}
	
	@BeforeEach
	void abc() {
		System.out.println("Before every test case");
	}
	
	@AfterEach
	void xyz() {
		System.out.println("After every test case");
	}
	
	@Test
	void testAdd() {
		
		assertEquals(30, c1.add(10, 20), ()->"Sum result is not right");
		assertEquals(50, c1.add(30, 20), ()->"Sum result is not right");
		assertEquals(-10, c1.add(10, -20), ()->"Sum result is not right");
	}
	
	@Test
	void testDiv() throws ArithmeticException {
		
		assertEquals(2, c1.div(10,5));
		assertThrows(ArithmeticException.class, ()->c1.div(90,0));
	}
}
