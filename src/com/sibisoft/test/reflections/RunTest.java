package com.sibisoft.test.reflections;

public class RunTest {  

	public static void main(String[] args) throws Exception{
		WasRun test = new WasRun("testMethod");
		System.out.println("WasRun = " + test.wasRun);
		test.testMethod();
		System.out.println("WasRun = "+test.wasRun);

	}
}
