package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngPractice {

	WebDriver driver;
	
	@BeforeTest
	public void Browsertest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	@Test
	public void Titletest()
	{
		String title=driver.getTitle();
		System.out.println("Title is : " +title);
	}
	
	@AfterTest
	public void closetest()
	{
		driver.close();
		//<class name="com.facebook.Facebook"/>
	}
	 
}
