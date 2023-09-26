package org.abc;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {

	@Test
	public void result() {
		Result r = JUnitCore.runClasses(A.class,B.class,C.class);
		
		System.out.println("Test run count " +r.getRunCount());
		System.out.println("test failure count "+r.getFailureCount());
		System.out.println("test ignore count "+r.getIgnoreCount());
		System.out.println("test runtime "+r.getRunTime());
		//suite
		System.out.println(r.wasSuccessful());
		
		//failures list
		System.out.println(r.getFailures());
		//OR
		
		List<Failure> faillist = r.getFailures();
		System.out.println(faillist);
		
		for (Failure X:faillist) {
		//	System.out.println(X);
			
		//	System.out.println(".....................................");
		
		   //header
			System.out.println("Header....");
			System.out.println(X.getTestHeader());
			//msg
			System.out.println("message........");
			System.out.println(X.getMessage());
			//Exception
			System.out.println("Exception......");
			System.out.println(X.getException());
		
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
