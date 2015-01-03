package com.sibisoft.test.reflections;

public class TestResult {

	public int runCount=0;
	public int errorCount=0;
	
	public String summary(){
		return  runCount+" run, "+errorCount+" failed";
	}
	
	public void testStarted(){
		runCount++;
	}
	
	public void testFailed(){
		errorCount++;
	}
}
