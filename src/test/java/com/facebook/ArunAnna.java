package com.facebook;

 
	import java.awt.Desktop.Action;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ArunAnna {
		
		WebDriver driver;
		
	@Test
	public void testcase() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().fullscreen();
		//Actions act = new Actions(driver);
		
	     Actions act = new Actions(driver);
	    WebElement	ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	    Thread.sleep(2000);
		act.doubleClick(ele).perform();
		

	}
	}
