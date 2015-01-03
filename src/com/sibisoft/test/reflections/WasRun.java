package com.sibisoft.test.reflections;

public class WasRun extends TestCase {
	
	String log;
	
	public WasRun(String methodName){
		super(methodName);
	}
	
	public void testMethod(){
		log += methodName+" ";
	}
	
	public void setUp(){
		log = "setUp ";
	}
	
	public void tearDown(){
		log += "tearDown ";
	}
}
