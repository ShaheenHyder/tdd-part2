package com.sibisoft.test.reflections;

public class RunTest {  

	public static void main(String[] args) throws Exception{
		
		new TestCaseTest("testRunning").run();
		new TestCaseTest("testSetUp").run();

	}
}
