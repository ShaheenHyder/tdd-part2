package com.sibisoft.test.reflections;

import java.lang.reflect.InvocationTargetException;
public class TestCaseTest extends TestCase{
	
	WasRun test ;
	
	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testTemplateMethod() throws SecurityException, 
								   IllegalArgumentException, 
								   NoSuchMethodException, 
								   IllegalAccessException, 
								   InvocationTargetException{
		
		WasRun test = new WasRun("testMethod");
		test.run();
		System.out.println(test.log);
		assert("setUp testMethod tearDown ".equals(test.log));
	}
	
}
