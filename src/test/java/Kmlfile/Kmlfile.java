package Kmlfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kmlfile {

	WebDriver driver;
	
	@BeforeClass
	public void setuptest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.windy.com/?16.889,1.143,3,m:eWKafCV");
	}
	
	@Test
	public void testcase1()
	{
		driver.findElement(By.xpath("(//div[.='d'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Upload KML, GPX or geoJSON file']")).click();
		driver.findElement(By.xpath("//label[.='Choose a file']")).click();
	   // uploadfile.sendKeys("/home/active30/Downloads/cosmosVDC.kml");
	}
}
