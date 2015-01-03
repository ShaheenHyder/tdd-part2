package com.sibisoft.tests;

import static org.junit.Assert.*;

public class TestCaseTest extends TestCase{
	
	TestCaseTest() {
		super();
	}

	public void testTemplateMethod(){
		WasRun test = new WasRun();
		test.run();
		assertEquals("setUp WasRun.testMethod tearDown ", test.log);
	}
}