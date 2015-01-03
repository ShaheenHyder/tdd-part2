package com.sibisoft.test.reflections;

public class TestResult {

	public int runCount;
	public int faildCount;
	
	public String summary(){
		return  runCount+" run, "+faildCount+" failed";
	}
	
	public void testStarted(){
		runCount++;
	}
	
	public void testFailed(){
		faildCount++;
	}
}
