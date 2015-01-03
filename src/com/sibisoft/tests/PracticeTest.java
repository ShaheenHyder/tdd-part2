package com.sibisoft.tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class PracticeTest {

	@Test 
	public void test(){
		 WasRun test = new WasRun();
		 assertTrue(test.wasRun.equals("false"));  
		 test.run();
		 assertTrue(test.wasRun.equals("true"));  

	} 
	
	@Test 
	public void testRunning(){
		TestCaseTest testCaseTest = new TestCaseTest();
		testCaseTest.testRunning();
	}

}
