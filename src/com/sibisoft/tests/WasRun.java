package com.sibisoft.tests;

public class WasRun extends TestCase{

	
	public WasRun(){
		super();
		wasRun = "false";
	}
	
	public void setUp(){
		wasRun= "false";
		wasSetUp="true";
	}
}