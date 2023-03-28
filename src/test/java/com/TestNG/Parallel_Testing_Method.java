package com.TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Testing_Method {

	WebDriver driver;
	
	@BeforeMethod
	public void testcase1()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
        driver.get("https://www.facebook.com");	
        System.out.println("parallel execution is success :"+Thread.currentThread().getId());
	}
	@Test
	public void testcase2() throws InterruptedException
	{
		
        driver.get("https://www.amazon.com");
        System.out.println("parallel execution is success :"+Thread.currentThread().getId());
	}
	@Test
	public void testcase3()
	{
		
        driver.get("https://www.flipkart.com");	
        System.out.println("parallel execution is success :"+Thread.currentThread().getId());
	}

}
