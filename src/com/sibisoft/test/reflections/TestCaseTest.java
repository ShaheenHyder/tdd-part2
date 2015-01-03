package com.sibisoft.test.reflections;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.lang.reflect.InvocationTargetException;
public class TestCaseTest extends TestCase{
	
	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testRunning() throws SecurityException,
									 IllegalArgumentException, 
									 NoSuchMethodException, 
									 IllegalAccessException, 
									 InvocationTargetException{
		WasRun test = new WasRun("testMethod");
		assertFalse(test.wasRun);
		test.run();
		assertTrue(test.wasRun);
	}

}
