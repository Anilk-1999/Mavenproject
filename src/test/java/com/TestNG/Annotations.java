package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
   
	@BeforeSuite(groups= {"sanity"})
	public void beforesuite()
	{
		System.out.println("hi hello boss i am beforesuite");
	}
	
	@AfterSuite(groups= {"sanity"})
	public void aftersuite()
	{
		System.out.println("hi hello boss i am aftersuite");
	}
	
	@BeforeTest(groups= {"regression"})
	public void beforetest()
	{
		System.out.println("hi hello boss i am beforetest");
	}
	
	@AfterTest(groups= {"sanity"})
	public void aftertest()
	{
		System.out.println("hi hello boss i am aftertest");
	}
	
	@BeforeClass(groups= {"regression"})
	public void beforeclass()
	{
		System.out.println("hey nanu kano beforeclass");
	}
	
	@AfterClass(groups= {"sanity"})
	public void afterclass()
	{
		System.out.println("yako macha marthbita nanu kano afterclass");
	}
	
	@BeforeMethod(groups= {"sanity"})
	public void beforemethod()
	{
		System.out.println("hey dude i am beforemethod");
	}
	
	@AfterMethod(groups= {"regression"})
	public void aftermethod()
	{
		System.out.println("yes is am aftermethod");
	}
	
	@Test(groups= {"sanity"})
	public void test()
	{
		System.out.println("i am test");
	}
	
}
