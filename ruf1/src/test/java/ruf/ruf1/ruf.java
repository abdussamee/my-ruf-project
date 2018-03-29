package ruf.ruf1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ruf {
	public WebDriver driver;
	
@BeforeTest
public void beforeTest() 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\sami\\Downloads\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
}

public void screenShort(String intger) throws IOException
{
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File("C:\\Users\\sami\\git\\ruf\\ruf1\\screenshorts\\"+intger+".png") );
}
@Test(priority=0,groups="group1")
public void test1() throws IOException
{
	driver.findElement(By.id("day")).click();
	screenShort("day");
	driver.findElement(By.id("month")).click();
	screenShort("month");
}
@Test(priority=1,groups="group2",enabled=false)
public void test2() throws IOException
{
	
}
  

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
