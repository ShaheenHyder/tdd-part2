package com.sibisoft.test.reflections;

public class RunTest {  

	public static void main(String[] args) throws Exception{
	
		TestSuite suite = new TestSuite();
		TestResult result = new TestResult();
		suite.add(new TestCaseTest("testTemplateMethod"));
		suite.add(new TestCaseTest("testResult"));
		suite.add(new TestCaseTest("testFailedResultFormatting"));
		suite.add(new TestCaseTest("testFailedResult"));
		suite.add(new TestCaseTest("testSuite"));
		suite.run(result);
		String summary = result.summary();
		System.out.println(summary);
		
	}
}
