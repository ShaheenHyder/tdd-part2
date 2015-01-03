package com.sibisoft.test.reflections;

public class RunTest {  

	public static void main(String[] args) throws Exception{
		WasRun test = new WasRun("testMethod");
		System.out.println("WasRun = " + test.wasRun);
		test.run();
		System.out.println("WasRun = "+test.wasRun);
		new TestCaseTest("testRunning").run();

	}
}
