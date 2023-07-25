package com.junitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags("production")
public class Included 
{
	@Test
	@Tag("development")
	@Tag("Production")
	public void test1()
	{
		
	}
	
	@Test
	@Tag("Production")
	public void test2()
	{
		
	}
	
	@Test
	@Tag("development")
	public void test3()
	{
		
	}
}
