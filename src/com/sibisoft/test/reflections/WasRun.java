package com.sibisoft.test.reflections;

public class WasRun extends TestCase {
	
	boolean wasRun ;
	boolean wasSetUp;
	
	public WasRun(String methodName){
		super(methodName);
		wasRun = false;
		wasSetUp = true;
	}
	
	public void testMethod(){
		wasRun = true;
	}
	
	public void setUp(){
		wasRun=false;
		wasSetUp=true;
	}
}
