package com.junitDemo;

import static org.junit.Assert.assertTrue;
import java.lang.annotation.ElementType;
import java.util.EnumSet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ExtensionPoints 
{
	@ParameterizedTest
	@EnumSource(value = ElementType.class, names = { "TYPE", "METHOD", "FIELD" })
	public void test1(ElementType et)
	{
		assertTrue(EnumSet.of(ElementType.FIELD, ElementType.TYPE, ElementType.METHOD).contains(et));
	}
}
