package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AssignmentTest {

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testXyz() {
		System.out.println("Running void test");
		Abc a1 = new Abc();
		
		a1.xyz();
		
		assertEquals(2, a1.getNumber());
	}
	
	@Test
	void testMethodCallCount() {
		System.out.println("Running method call count test");
		Abc a1 = new Abc();
		
		a1.xyz();
		a1.xyz();
		a1.xyz();
		
		//assertEquals(3, a1.getCallCount());
		assertEquals(8, a1.getNumber());
		
		
	}
	
	@Test
	void testInterface() {
		NumberString ns = new NumberString() {
			
			
			//cube
			@Override
			public String returnString(int n) {
				return ""+n;
			}
		};
		
		System.out.println("Interface test");
		assertEquals("100", ns.returnString(100));

	}
}
