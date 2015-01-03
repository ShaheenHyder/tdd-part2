package com.sibisoft.tests;

import static org.junit.Assert.*;

public class TestCaseTest extends TestCase{
	
	WasRun test = null;
	
	TestCaseTest() {
		super();
	}

	public void testRunning(){
		this.setUp();
		test.run();
		assertTrue(test.wasRun.equals("true"));
	}
	
	public void testSetUp(){
		this.setUp();
		test.run();
		assertEquals("setUp WasRun.testMethod", test.log);
	}
	
	public void setUp(){
		test = new WasRun();
		
	}
}