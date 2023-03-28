package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_passparametertoSetup {

	
	WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void setuptest(String br,String appurl)
	{
		if(br.equals("chrome"))
		{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(appurl);
		
	}
	@Test(priority = 1)
	public void Testcase2()
	{
		String actualurl = driver.getCurrentUrl();
		String expectedurl="https://www.amazon.in/";
		AssertJUnit.assertEquals(actualurl, expectedurl);
	}
	
	@Test(priority = 2 )
	public void Testcase3()
	{
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Account & Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	
	@AfterClass
	public void closetest()
	{
		driver.close();
	}
	
	
	
	
}
