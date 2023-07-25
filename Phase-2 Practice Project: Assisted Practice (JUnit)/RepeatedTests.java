package com.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTests 
{
	@RepeatedTest(5)
	public void test1()
	{
		System.out.println("Hello");
	}
	
	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Execution")
	public void test2(TestInfo testinfo)
	{
		System.out.println(testinfo.getDisplayName());
	}
	
	@RepeatedTest(5)
	public void test3(RepetitionInfo repetitionInfo)
	{
		System.out.println("Current Test Count " + repetitionInfo.getCurrentRepetition());
	}
}
