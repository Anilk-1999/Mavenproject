package com.TestNG_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Firstlistener implements ITestListener
{
  public void onTestStart(ITestResult result)
  {
	 System.out.println("this test case is starting..........."); 
  }
	
  public void onTestSuccess(ITestResult result)
  {
	 System.out.println("this test case is pass........");
  }

  public void onTestFailure(ITestResult result)
  {
	System.out.println("this test case is fail...........");
  }

  public void onTestSkipped(ITestResult result)
  {
	  System.out.println("this test case is skip.........");
  }
  
  public void onFinish(ITestContext context)
  {
	 System.out.println("Finished......................");
  }
  
}
