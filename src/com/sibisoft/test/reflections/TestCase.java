package com.sibisoft.test.reflections;

import java.lang.reflect.Method;

public class TestCase {
	
	String methodName ;
	TestResult result;

	public TestCase(String methodName){
		this.methodName = methodName;
	}
	
	public void run(TestResult result) throws Exception {
		result.testStarted();
		setUp();
		try{
			  Method method = this.getClass().getMethod(methodName);
	    	  method.invoke(this);
	      }catch(Exception ex){
	    	  result.testFailed();
	      }
  	    tearDown();
	}
	
	public void setUp() throws Exception{
		
	}
	
	public void tearDown(){
		
	}
}
