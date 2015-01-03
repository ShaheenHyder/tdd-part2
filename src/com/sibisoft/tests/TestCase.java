package com.sibisoft.tests;

public class TestCase {
	
	public String wasRun ;
	public String log;
	
	public TestCase(){
	}
	
	public void testMethod(){
		wasRun = "true";
	}
	
	public void run(){
		this.setUp();
		testMethod();
	}
	
	public void setUp(){
		
	}
}