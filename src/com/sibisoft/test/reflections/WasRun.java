package com.sibisoft.test.reflections;

public class WasRun extends TestCase {
	
	String log;
	
	public WasRun(String methodName){
		super(methodName);
	}
	
	public void testMethod(){
		log += methodName+" ";
	}
	
	public void setUp() throws Exception{
		log = "setUp ";
//		throw new Exception("Exception here");
	}
	
	public void tearDown(){
		log += "tearDown ";
	}
	
	public void testBrokenMethod() throws Exception{
		
		throw new Exception("Exception here");
		
	}
	
}
