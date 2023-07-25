package com.junitDemo;

import static org.junit.Assert.assertNotNull;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentConversion 
{
	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	public void test1(TimeUnit arg)
	{ // Implicit conversion
		System.out.println(arg.name());
		assertNotNull(arg.name());
	}
}
