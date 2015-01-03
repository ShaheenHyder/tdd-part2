package com.sibisoft.test.reflections;

import java.lang.reflect.Method;

public class TestCase {
	
	String methodName ;

	public TestCase(String methodName){
		this.methodName = methodName;
	}
	
	public TestResult run() throws Exception {
		Method method = this.getClass().getMethod(methodName);
		TestResult result = new TestResult();
		result.testStarted();
		setUp();
		try{
	    	  method.invoke(this);
	      }catch(Exception ex){
	    	  //ex.printStackTrace();
	    	  result.testFailed();
	      }
  	    tearDown();
  	    return result;

	}
	
	public void setUp(){
		
	}
	
	public void tearDown(){
		
	}
}
