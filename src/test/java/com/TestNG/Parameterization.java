package com.TestNG;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	WebDriver driver;
	  

	  
	   @BeforeClass
	   public void test()
	   {
		   WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        }
	   
	   
	        @Parameters({"username","password"})
			@Test()
			public void logintest(String uname,@Optional("Anil123@#")String paswrd) throws InterruptedException
			{

		    Thread.sleep(2000);
		    driver.findElement(By.id("email")).sendKeys(uname);
		    Thread.sleep(2000);
		    driver.findElement(By.name("pass")).sendKeys(paswrd);
		    Thread.sleep(2000);
		    driver.findElement(By.name("login")).click();
	         }
			
			@AfterClass
			public void browserclose()
			{
				driver.close();
			}

}
