package com.junitDemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo {
	
	@Test
	public void test1() {
		//assertTrue("abc".contains("a"));
	    Assumptions.assumeTrue("abc".contains("z"));
	    System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		Assumptions.assumingThat("abc".contains("z"), ()-> {
			System.out.println("Friday");
		});
	}

}
