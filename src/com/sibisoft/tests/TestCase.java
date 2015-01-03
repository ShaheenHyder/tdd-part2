package com.sibisoft.tests;

public class TestCase {
	
	public String wasRun ;
	
	TestCase(){
	}
	
	public void testMethod(){
		wasRun = "true";
	}
	
	public void run(){
		testMethod();
	}
}