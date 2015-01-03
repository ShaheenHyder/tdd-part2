package com.sibisoft.tests;

public class WasRun extends TestCase{

	
	public WasRun(){
		super();
	}
	
	public void setUp(){
		log="setUp ";
	}
	
	public void testMethod(){
		log += "WasRun.testMethod ";
	}
	
	public void tearDown(){
		log += "tearDown ";
	}
}