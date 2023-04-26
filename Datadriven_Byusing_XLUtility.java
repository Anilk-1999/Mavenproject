package datadrivenTesting;

import java.io.IOException;
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

public class Datadriven_Byusing_XLUtility {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider = "logindata")
	public void login(String user,String pwd,String exp)
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
				//driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();

				//driver.findElement(By.xpath("//a[.='Logout']")).click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}

		}
	}
	@DataProvider(name="logindata")
	public String[][] getdata() throws IOException
	{
	String	path="./Testdata/Datadriver.xlsx";
	
	XLUtility xlutil=new XLUtility(path);
	
	int countrow=xlutil.getRowCount("Sheet1");
	int countcell=xlutil.getCellCount("Sheet1",1);
		
		String logindata[][]=new String [countrow][countcell];
		
		for (int i = 1; i <=countrow; i++) 
		{
			
			for (int j = 0; j <countcell ; j++) 
			{
				logindata[i-1][j]=xlutil.getcellData("Sheet1", i, j);
			}
		}
		return logindata;
	}
	
}
