package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PassingparameterswithDataprovider {
	WebDriver driver;
	  

	  
	   @BeforeMethod
	   public void test()
	   {
		   WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        }
	   
	   
			@Test(dataProvider = "passingparameterwithdataprovider")
			public void logintest(String uname,String paswrd) throws InterruptedException
			{

		    Thread.sleep(2000);
		    driver.findElement(By.id("email")).sendKeys(uname);
		    Thread.sleep(2000);
		    driver.findElement(By.name("pass")).sendKeys(paswrd);
		    Thread.sleep(2000);
		    driver.findElement(By.name("login")).click();
	         }
			
			@AfterMethod
			public void browserclose()
			{
				driver.close();
			}
			
			
           @DataProvider()
           public static Object[][] passingparameterwithdataprovider()
           {
        	   return new Object[][] {{"anilkumar327a@gmail.com","Anil123@#"},{"anilkumar327a@gmail.com","Anil123"}};
           }

}
