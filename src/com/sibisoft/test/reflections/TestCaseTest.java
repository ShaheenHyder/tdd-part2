package com.sibisoft.test.reflections;

import java.lang.reflect.InvocationTargetException;
public class TestCaseTest extends TestCase{
	
	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testRunning() throws SecurityException,
									 IllegalArgumentException, 
									 NoSuchMethodException, 
									IllegalAccessException,
									InvocationTargetException 
									 {
		WasRun test = new WasRun("testMethod");
		System.out.println("TestCaseTest.WasRun = "+test.wasRun);
		try{
			test.run();	
		}catch(SecurityException ex){
			ex.printStackTrace();
		}catch(IllegalArgumentException ex){
			ex.printStackTrace();
		}catch(NoSuchMethodException ex){
			ex.printStackTrace();
		}catch(IllegalAccessException ex){
			ex.printStackTrace();
		}catch(InvocationTargetException  ex){
			ex.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("TestCaseTest.WasRun = "+test.wasRun);
		
	}

}
