package com.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Disabledd 
{
	@BeforeAll
	public static void setUp()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Today");
	}
	
	@Disabled
	@Test
	public void test2()
	{
		System.out.println("is");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Friday");
	}
	
	@AfterAll
	public static void tearDown()
	{
		System.out.println("Bye Bye");
	}
}
