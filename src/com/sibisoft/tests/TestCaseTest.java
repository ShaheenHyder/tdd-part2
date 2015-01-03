package com.sibisoft.tests;

import static org.junit.Assert.*;

public class TestCaseTest extends TestCase{
	
	TestCaseTest() {
		super();
	}

	public void testRunning(){
		WasRun testRunning = new WasRun();
		assertTrue(testRunning.wasRun.equals("false"));
		testRunning.run();
		assertTrue(testRunning.wasRun.equals("true"));
	}
}