package com.sibisoft.test.reflections;

public class WasRun {
	
	boolean wasRun ;
	
	public WasRun(String methodName){
		wasRun = false;
	}
	
	public void testMethod(){
		wasRun = true;
	}

}
