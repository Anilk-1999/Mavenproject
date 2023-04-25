package datadrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriventesting_byusing_dataprovider {

WebDriver driver;

@BeforeClass
public void setup()
{
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}

@Test(dataProvider = "logindata")
public void testcase1(String user,String pwd,String exp)

{
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
username.clear();
username.sendKeys(user);

WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.clear();
	password.sendKeys(pwd);
	
	driver.findElement(By.xpath("//button[.=' Login ']")).click();
	
	String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	String actual =driver.getCurrentUrl();
	
	if(exp.equals("valid"))
	{
		if(expected.equals(actual))
		{
			driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();

			driver.findElement(By.xpath("//a[.='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	else if(exp.equals("invalid"))
	{
		if(expected.equals(actual))
		{
//			driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
//
//			driver.findElement(By.xpath("//a[.='Logout']")).click();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
}

@DataProvider(name="logindata")
public  String[][] getData()
{
	String logindata[][]= {
			{"Admin","admin123","valid"},
			{"ani123@gmail.com","ani123","invalid"},
			{"anil@gmail.com","anil123","invalid"},
			{"anil123@gmail.com","anil","invalid"}
	};
return logindata;

}


}
