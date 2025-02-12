package com.assignment;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class MyInterfaceTest {

	@Test
	void testAbc() {
		MyInterface mi = mock(MyInterface.class);
		mi.abc();
		mi.abc();
		mi.abc();
		verify(mi, times(1)).abc(); // void method
		verify(mi, times(3)).abc(); // method is called 3 times or not
		//verify(mi, times(0)).abc(); // If you don't want to be called at all.
	}

}
