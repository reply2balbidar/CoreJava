package com.javaworld.array.test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import com.javaworld.array.CyclicArray;

public class CyclicArrayTest {

	
	@Test
	public void testArrayIsCyclic() {
		int expected []=new int[] {8, 2, 3, 4, 5, 6, 7};
		Assertions.assertArrayEquals(expected, 
				CyclicArray.rotate(new int[] {2,3,4,5,6,7,8}));
	}
}
