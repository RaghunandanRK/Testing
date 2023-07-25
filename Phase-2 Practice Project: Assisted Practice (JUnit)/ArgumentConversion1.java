package com.junitDemo;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;

public class ArgumentConversion1 
{
	@ParameterizedTest
	@EnumSource(TimeUnit.class)//Explicit Conversion
	public void test2(@ConvertWith(ArgumentConverter.class) String arg)
	{
		assertNotNull(TimeUnit.valueOf(arg));
	}
}
