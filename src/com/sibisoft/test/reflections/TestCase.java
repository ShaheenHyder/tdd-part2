package com.sibisoft.test.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
	
	String methodName ;

	public TestCase(String methodName){
		this.methodName = methodName;
	}
	
	public void run() throws SecurityException, 
    							NoSuchMethodException, 
    							IllegalArgumentException, 
    							IllegalAccessException, 
    							InvocationTargetException {
		Method method = this.getClass().getMethod(methodName);
		setUp();
		try{
	    	  method.invoke(this);
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      }
  	    tearDown();

	}
	
	public void setUp(){
		
	}
	
	public void tearDown(){
		
	}
}
