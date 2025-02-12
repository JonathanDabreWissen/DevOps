package com;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@DisplayName("Testing Arithmetic Operations")
@TestInstance(Lifecycle.PER_CLASS) // PER_METHOD (Default)
class CalculatorTest {
	CalculatorTest(){
		System.out.println("-----------Calculator Test object is created-------------");
	}
	
	static Calculator c1 = null;
	static int x = 2;
	static boolean condition = false;
	
	@BeforeAll  //@BeforeClass
	static void createCalculator() {
		c1 = new Calculator();
		System.out.println("-----------Started--------------");
	}
	
	
	@AfterAll //@AfterClass
	static void removeCalculator() {
		c1 = null;
		System.out.println("-----------Finished--------------");
	}
	
	@BeforeEach  //@Before
	void abc() {
		System.out.println("Before every test case");
	}
	
	@AfterEach //@After
	void xyz() {
		System.out.println("After every test case");
	}
	
	@Test
	@DisplayName("Testing Addition")
	@Tag("math")
	void testAdd() {
		
		assertEquals(30, c1.add(10, 20), ()->"Sum result is not right");
		assertEquals(50, c1.add(30, 20), ()->"Sum result is not right");
		assertEquals(-10, c1.add(10, -20), ()->"Sum result is not right");
	}
	
	@Test
	@DisplayName("Testing Division")
	@Tag("math")
	void testDiv() throws ArithmeticException {
		
		assertEquals(2, c1.div(10,5));
		assertThrows(ArithmeticException.class, ()->c1.div(90,0));
		System.out.println("From testDiv() method");
	}
	
	
	@Test
	@DisplayName("Testing Multiply")
	@Tag("math")
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
	
	@Test
	//@Disabled  //@Ignore
	@Tag("math")
	void testMod() {
		assertAll(
				()->assertEquals(0, c1.mul(10,5)),
				()->assertEquals(2, c1.mul(20,3)),
				()->assertEquals(1, c1.mul(3,2))
			);
	}

	@Test
	@EnabledOnJre(value = JRE.JAVA_8)
//	@EnabledOnJre(min = JRE.JAVA_11, max = JRE.JAVA_15)
	@Tag("demo")
	void testLambda(){
		System.out.println("Testing for Lambda expressions");
	}
	
	@Test
	@EnabledOnOs(value = {OS.WINDOWS})
	@Disabled
	@Tag("demo")
	void testDll() {
		System.out.println("Testing DLL");
	}
	
	@Test
	@EnabledOnOs(value = {OS.LINUX, OS.MAC})
	@Disabled
	@Tag("demo")
	void testShellScripts() {
		System.out.println("Testing Shell Scripts");
	}
	
	@Test
	@Disabled
	@Tag("math")
	@Tag("demo")	
	void testDynamically() {
		System.out.println("Testing Dynamically ");
		assertEquals(2, c1.div(10,  5));
		assumeTrue(condition);
		assertEquals(15, c1.div(30, x));
		
	}
	
	@Test
	@Tag("db")
	void testInsert() {
		System.out.println("Test Insert");
	}
	
	@Test
	@Tag("db")
	void testUpdate() {
		System.out.println("Test Update");
	}
	
	@Test
	@Tag("db")
	void testDelete() {
		System.out.println("Test Delete");
	}
	
	@Test
	@Tag("db")
	void testSearch() {
		System.out.println("Test Search");
	}
	
}
