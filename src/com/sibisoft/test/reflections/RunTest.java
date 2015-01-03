package com.sibisoft.test.reflections;

public class RunTest {  

	public static void main(String[] args) throws Exception{
		
		new TestCaseTest("testTemplateMethod").run();
		new TestCaseTest("testResult").run();
		new TestCaseTest("testFailedResult").run();
		

	}
}
