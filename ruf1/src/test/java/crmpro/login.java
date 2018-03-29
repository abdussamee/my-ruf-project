package crmpro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login
{
	WebDriver driver;
	@BeforeTest
	public void launch() 
	{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sami\\Desktop\\sami\\jars\\chromedriver.exe\\");
	driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("http://freecrm.com/index.html");
	}
	
  @Test(priority=0)
  public void login() throws InterruptedException
  {
	  
	
	  driver.findElement(By.xpath("//input [@name='username']")).sendKeys("abdussamee");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
   
 
  @AfterTest
  public void afterTest() throws Exception
  {
	  Thread.sleep(3000);
	//driver.close();
  }
}
