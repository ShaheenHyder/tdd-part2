package com.sibisoft.test.reflections;

public class TestCaseTest extends TestCase{
	
	WasRun test ;
	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testTemplateMethod() throws Exception{
		
		test = new WasRun("testMethod");
		test.run(result);
		System.out.println(test.log);
		assert("setUp testMethod tearDown ".equals(test.log));
	}
	
	public void testResult() throws Exception{
		test = new WasRun("testMethod");
		test.run(result);
		assert ("1 run, 0 failed".equals(result.summary()));
	}
	
	public void testFailedResult() throws Exception{
		test = new WasRun("testBrokenMethod");
		test.run(result);
		assert("1 run, 1 failed".equals(result.summary()));
	}
	
	public void testFailedResultFormatting(){
		result.testStarted();
		result.testFailed();
		assert("1 run, 1 failed".equals(result.summary()));
	}
	
	public void testSuite() throws Exception{
		TestSuite suit = new TestSuite();
		suit.add(new WasRun("testMethod"));
		suit.add(new WasRun("testBrokenMethod"));
		suit.run(result);
		
		assert("2 run, 1 failed".equals(result.summary()));
	}
	
	public void setUp(){
		result = new TestResult();
	}
}
