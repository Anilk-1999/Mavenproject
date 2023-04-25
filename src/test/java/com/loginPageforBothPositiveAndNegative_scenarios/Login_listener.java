package com.loginPageforBothPositiveAndNegative_scenarios;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Login_listener implements ITestListener 
{

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extents;
	public ExtentTest test;
	
	public void onStart(ITestContext context)
	{
	
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional testing");
		sparkReporter.config().setTheme(Theme.DARK);
	    
		extents=new ExtentReports();
		extents.attachReporter(sparkReporter);
		extents.setSystemInfo("Computer name", "Dell");
		extents.setSystemInfo("Environment","QA");
		extents.setSystemInfo("Tester Name","Anil");
		extents.setSystemInfo("OS","LINUX");
		extents.setSystemInfo("Browser Name", "Chrome");
	
	}
	
	public void onTestSuccess(ITestResult Result)
	{
		test=extents.createTest(Result.getName());
		test.log(Status.PASS, "this test case is passes :" +Result.getName());
	}
	
	public void onTestFailure(ITestResult Result)
	{
		test=extents.createTest(Result.getName());
		test.log(Status.FAIL, "The test case is failed :"+Result.getName());
		test.log(Status.FAIL, "The test case is failed :"+Result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult Result)
	{
		test=extents.createTest(Result.getName());
		test.log(Status.SKIP, "the tetscase is skipped :"+Result.getName());
	}
	
	public void onFinish(ITestContext context) 
	{
		extents.flush();
	}
	
}
