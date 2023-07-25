package com.junitDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Assertions 
{
	@Test
	public void testAssertions()
	{
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		//check that two object are equal
		assertEquals(str1, str2);
		
		//check that a condition is true
		assertTrue(val1 < val2);
		
		//Check that a condition is false
		assertFalse(val1 > val2);
		
		//Check that an object is not null
		assertNotNull(str1);
		
		//Check that an object is null
		assertNull(str3);
		
		//Check of two object reference point to the same object
		assertSame(str4, str5);
		
		//check if two object reference do  not point to the same object
		assertNotSame(str1, str3);
		
		//check if 2 arrays are equal
		assertArrayEquals(expectedArray, resultArray);
	}

}
