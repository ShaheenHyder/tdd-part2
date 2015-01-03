package com.sibisoft.test.reflections;

import java.lang.reflect.InvocationTargetException;
public class TestCaseTest extends TestCase{
	
	WasRun test ;
	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testRunning() throws SecurityException,
									 IllegalArgumentException, 
									 NoSuchMethodException, 
									IllegalAccessException,
									InvocationTargetException 
									 {
		this.setUp();
		test.run();
		assert (test.wasRun);
	}
	
	public void testSetUp() throws SecurityException, 
								   IllegalArgumentException, 
								   NoSuchMethodException, 
								   IllegalAccessException, 
								   InvocationTargetException{
		
		this.setUp();
		test.run();
		assert (test.wasSetUp);
	}
	
	public void setUp(){
		test = new WasRun("testMethod");
	}
	

}
