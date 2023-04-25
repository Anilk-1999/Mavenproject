package com.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
	}
	@Test
	public void testcase() throws AWTException, InterruptedException
	{
		
//		String path =System.getProperty("user.dir")+"\\Robot\\a.json";
//		StringSelection strsel=new StringSelection(path);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsel, null);
 
		WebElement ele=driver.findElement(By.id("file-upload"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		
		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_TAB);
//		rob.keyRelease(KeyEvent.VK_TAB);
//		rob.keyPress(KeyEvent.VK_TAB);
//		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
    	rob.keyPress(KeyEvent.VK_ENTER);
    	rob.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(2000);
    	rob.keyPress(KeyEvent.VK_ENTER);
    	rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_RIGHT);
		rob.keyRelease(KeyEvent.VK_RIGHT);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
    	rob.keyPress(KeyEvent.VK_ENTER);
    	rob.keyRelease(KeyEvent.VK_ENTER);
    	
    	driver.findElement(By.id("file-submit")).click();
	}
	
}
