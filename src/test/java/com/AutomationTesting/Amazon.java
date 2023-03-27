package com.AutomationTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Amazon {
	WebDriver driver;
	
	@BeforeClass
	public void setuptest() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	
	@Test(description = "browserlaunch testing", priority = 1)
	public void Testcase1()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(description = "currenturl testing in home page",priority = 2)
	public void Testcase2()
	{
		String actualurl = driver.getCurrentUrl();
		String expectedurl="https://www.amazon.in/";
		AssertJUnit.assertEquals(actualurl, expectedurl);
	}
	
	@Test(description = "mouseover on Account & Lists testing",priority = 3 )
	public void Testcase3()
	{
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Account & Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	
	@Test(description = "verify the sign",priority = 6)
	public void Testcase4() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("anilk111umar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Anilkumar327@#");
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
	
	}
    
	
	@Test(description = "Title testing in home page",priority = 4)
	public void Testcase5() 
	{

		String actualTitle=driver.getTitle();
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
	
	// HOME PAGE VERIFICATION
	
	@Test(description = "image verify",priority = 5,alwaysRun = true)
	public void Testcase6()
	{

	     WebElement img=driver.findElement(By.xpath("//img[@alt='Spring summer']"));
	     AssertJUnit.assertEquals(true, img.isDisplayed());
	}
	
	
	@Test(description = "verify the scroll bar", priority = 7)
	public void Testcase7() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1200)");
	    Thread.sleep(2000);
	  
	    Robot rb=new Robot();
	    rb.keyPress(KeyEvent.VK_UP);
	    rb.keyRelease(KeyEvent.VK_UP);
	    rb.keyPress(KeyEvent.VK_UP);
	    rb.keyRelease(KeyEvent.VK_UP);
	    rb.keyPress(KeyEvent.VK_UP);
	    rb.keyRelease(KeyEvent.VK_UP);
	    
	    //js.executeScript("window.scrollBy(400,0)");
	   // driver.findElement(By.xpath("(//a[@aria-label=\"Carousel next slide\"])[1]")).click();
	   
	}
	
	@Test(priority = 8)
	public void Testcase8()
	{
		driver.findElement(By.xpath("//a[@class=\"a-link-normal as-title-block-right see-more truncate-1line\"]")).click();
	}
	
	@Test(priority = 9)
	public void Testcase9()
	{
		JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,1400)");
	}
	
	@Test(description = "verify the image",priority = 10)
	public void Testcase10() throws InterruptedException
	{
		 WebElement img1 = driver.findElement(By.xpath("(//img[@class='DealImage-module__imageObjectFit_1G4pEkUEzo9WEnA3Wl0XFv'])[13]"));
	    AssertJUnit.assertEquals(true, img1.isDisplayed());
	}
	
	@Test(description = "double click on the element(image)",priority = 11)
	public void Testcase11() throws InterruptedException
	{
	    Thread.sleep(2000);
	    WebElement img2 = driver.findElement(By.xpath("//img[@alt='Apple Airpods starting Rs. 10999']"));
	    Actions act1 = new Actions(driver);
	    act1.doubleClick(img2).perform();
	}
	
	
	@Test(description = "verify the currenturl",enabled = false)
	public void Testcase12() throws InterruptedException
	{
		 Thread.sleep(2000);
		String actualurl1=driver.getCurrentUrl();
	    String expectedurl1="https://www.amazon.in/deal/cae5f9da/?_encoding=UTF8&showVariations=true&_ref=dlx_gate_sd_dcl_tlt_cae5f9da_dt&pd_rd_w=nwImE&content-id=amzn1.sym.a532052b-26f3-4811-a261-3b35ffa57237&pf_rd_p=a532052b-26f3-4811-a261-3b35ffa57237&pf_rd_r=DWBNBYTYYJ4NN5QVTECJ&pd_rd_wg=8cA6B&pd_rd_r=edbe63d7-fc88-4499-97db-7c98d8873efa&ref_=pd_gw_unk"; 
	    AssertJUnit.assertEquals(actualurl1, expectedurl1);
	}
	
	@Test(description = "Title of the page",priority = 12 )
	public void Testcase13() throws InterruptedException
	{
	    Thread.sleep(2000);
	   String actualtitle1=driver.getTitle();
	   String expectedtitle1="Apple Airpods starting Rs. 10999";
	   AssertJUnit.assertEquals(actualtitle1, expectedtitle1);
	
	}
	
	
	@Test(description = "verify the 3rd generation image",priority = 13)
	public void Testcase14()
	{
		boolean img2 = driver.findElement(By.xpath("(//div[@class=\"a-section octopus-dlp-image-shield\"])[2]")).isDisplayed();
		AssertJUnit.assertTrue(img2);
	}
	
	@Test(description = "right click on the 3rd generation image AND click on same image",priority = 14)
	public void Testcase15() throws InterruptedException
	{
//		WebElement right = driver.findElement(By.xpath("(//div[@class=\"a-section octopus-dlp-image-shield\"])[2]"));
//		Actions act2=new Actions(driver);
//		act2.contextClick(right).perform();
		
		driver.findElement(By.xpath("(//div[@class='a-section octopus-dlp-image-shield'])[2]")).click();
		Thread.sleep(2000);
		WebElement elem2 = driver.findElement(By.xpath("//span[@id='a-autoid-7']"));
        Actions act4 = new Actions(driver);
        act4.moveToElement(elem2).perform();
        Thread.sleep(2000);
        WebElement elem3 = driver.findElement(By.xpath("//span[@id='a-autoid-8']"));
        Actions act5 = new Actions(driver);
        act5.moveToElement(elem3).perform();
        Thread.sleep(2000);
        WebElement elem1 =driver.findElement(By.xpath("//span[@id='a-autoid-6']"));
        Actions act6 = new Actions(driver);
        act6.moveToElement(elem1).perform();
	}
	
	@Test(description = "verify the Add gift options checkbox AND verify the quantity dropdown ",priority = 15)
	public void Testcase16() throws InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.id("quantity"));
		Select sel=new Select(drop);
		sel.selectByValue("2");
	}
	
	@Test(description = "verify the add cart AND title",priority = 16)
	public void Testcase17() throws InterruptedException
	{
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.=' Skip '])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='a-button-text'])[3]")).click();
		
		String actualtitle1 = driver.getTitle();
		String expectedtitle1="Amazon.in Shopping Cart";
		AssertJUnit.assertEquals(actualtitle1, expectedtitle1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='deselect-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
	}
	
	@Test(priority = 17,description = "logout from amazon application")
	public void Testcase18() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Account & Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Sign Out']")).click();
	}
	

//	@Test(priority = 17)
//	public void Test()
//	{
//		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
//		driver.findElement(By.xpath("//a[@id='quantity_1']")).click();
//	}
	
	
	@Test(description = "create new account",enabled = false)
	public void Testcase() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='Start here.']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("customerName")).sendKeys("Anil Kumar");
	    Thread.sleep(2000);
	    driver.findElement(By.name("email")).sendKeys("9620780883");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("anilk111umar@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Anilkumar327@#");
	    Thread.sleep(2000);
	    driver.findElement(By.id("continue")).click();
	}
	
	
	@AfterClass
	public void closeTestcase() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
