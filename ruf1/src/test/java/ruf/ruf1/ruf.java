package ruf.ruf1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ruf
{
 
	@Test
  public void ruf()
	{
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sami\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
	}
}
