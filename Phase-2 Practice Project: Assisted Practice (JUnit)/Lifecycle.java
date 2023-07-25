package com.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Lifecycle 
{
	@BeforeAll
	public static void setUp() 
	{
		System.out.println("Hello");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@AfterAll
	public static void tearDown()
	{
		System.out.println("Bye Bye");
	}
}
