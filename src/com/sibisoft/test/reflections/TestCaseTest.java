package com.sibisoft.test.reflections;

public class TestCaseTest extends TestCase{
	
	WasRun test ;
	
	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testTemplateMethod() throws Exception{
		
		WasRun test = new WasRun("testMethod");
		TestResult result = test.run();
		System.out.println(test.log);
		System.out.println(result.summary());
		//assert("1 run, 1 failed".equals(result.summary()));
		assert("setUp testMethod tearDown ".equals(test.log));
	}
	
	public void testResult() throws Exception{
		WasRun test = new WasRun("testMethod");
		TestResult result = test.run();
		System.out.println(result.summary());
		assert ("1 run, 0 failed".equals(result.summary()));
	}
	
	public void testFailedResult() throws Exception{
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = test.run();
		System.out.println(result.summary());
		assert("1 run, 1 failed".equals(result.summary()));
	}
	
	public void testFailedResultFormatting(){
		TestResult result =  new TestResult();
		result.testStarted();
		result.testFailed();
		System.out.println(result.summary());
		assert("1 run, 1 failed".equals(result.summary()));
	}
	
}
