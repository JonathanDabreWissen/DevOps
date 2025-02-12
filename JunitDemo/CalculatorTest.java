package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Arithmetic Operations")
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
	@DisplayName("Testing Addition")
	void testAdd() {
		
		assertEquals(30, c1.add(10, 20), ()->"Sum result is not right");
		assertEquals(50, c1.add(30, 20), ()->"Sum result is not right");
		assertEquals(-10, c1.add(10, -20), ()->"Sum result is not right");
	}
	
	@Test
	@DisplayName("Testing Division")
	void testDiv() throws ArithmeticException {
		
		assertEquals(2, c1.div(10,5));
		assertThrows(ArithmeticException.class, ()->c1.div(90,0));
		System.out.println("From testDiv() method");
	}
	
	
	@Test
	@DisplayName("Testing Multiply")
	@Disabled
	void testMul(){
		System.out.println("From testMulStart() method");
//		assertEquals(50, c1.mul(10,5));
//		assertEquals(100, c1.mul(20,5));
//		assertEquals(40, c1.mul(10,6)); // if at any step it fails it will stop further execution.
//		assertEquals(90, c1.mul(10,9));
//		assertEquals(30, c1.mul(20,5));
//		assertEquals(30, c1.mul(6,5));
		assertAll(
			()->assertEquals(50, c1.mul(10,5)),
			()->assertEquals(100, c1.mul(20,5)),
			()->assertEquals(60, c1.mul(10,6)),
			()->assertEquals(90, c1.mul(10,9)),
			()->assertEquals(100, c1.mul(20,5)),
			()->assertEquals(30, c1.mul(6,5))
		);
		
		System.out.println("From testMulEnd() method");
		
		
	}
}
