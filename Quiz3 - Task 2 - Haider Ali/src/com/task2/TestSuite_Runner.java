package com.task2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import com.task2.testSuites.TestSuite_SortedIntegerList;

public class TestSuite_Runner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(TestSuite_SortedIntegerList.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }		
	      System.out.println("Test Suite Ran Successfully: "+result.wasSuccessful());
	}
}