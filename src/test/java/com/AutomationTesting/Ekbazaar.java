package com.AutomationTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ekbazaar {

WebDriver driver;
	
	@BeforeClass
	public void setupTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		
		driver.get("https://tradebazaar.tech-active.com/");
		driver.findElement(By.xpath("//a[@class='sign-in-btn']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Number']")).sendKeys("7855040693");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Tester@123");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		//driver.findElement(By.xpath("//div[@class='sell']")).click();//div[.='Go to Buyer Portal']
		driver.findElement(By.xpath("//div[.='Go to Buyer Portal']")).click();
	}
	
}
