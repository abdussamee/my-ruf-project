package crmpro;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class homepage extends login
{
 
	@Test(priority=1,enabled=true)
  public void homepage() throws InterruptedException 
  {
		String expurl="http://crmpro.com/";
		String acturl=driver.getCurrentUrl();
		if(acturl.equalsIgnoreCase(expurl))
		{
			System.out.println("correct page");
		}else {
			System.out.println("wrong page");
		}
	  
  }
	
	@Test(priority=2,enabled=true)
	  public void CreateCompany() throws InterruptedException 
	  {
		    Thread.sleep(5000);
		    driver.switchTo().frame("mainpanel");
			driver.findElement(By.xpath("//input [@name='company_name']")).sendKeys("WexosInformitica");
			driver.findElement(By.name("contact_first_name")).sendKeys("Wexos");
			driver.findElement(By.name("contact_surname")).sendKeys("Informitica");
			driver.findElement(By.xpath("//input [@class='button']")).click();
		  System.out.println("this is createcompany");
	  }

@Test(priority=3,enabled=true)
public void search() throws InterruptedException 
{
	Thread.sleep(5000);
	//driver.switchTo().frame("mainpanel");
	driver.findElement(By.name("search")).sendKeys("WexosInformitica"); 
	driver.findElement(By.xpath("(//input [@type='image'])[1]")).click();
	System.out.println("this is search");
}

@Test(priority=4,enabled=true)
public void CRMPRO_News() throws InterruptedException 
{
	//Thread.sleep(5000);
	//driver.switchTo().frame("mainpanel");
	
	driver.findElement(By.xpath("//a [text()='New Help Center']")).click();
	Set<String>window=driver.getWindowHandles();
	java.util.Iterator<String>itt=window.iterator();
	String parentwindow=itt.next();
	String childwindow=itt.next();
	driver.switchTo().window(parentwindow);
	System.out.println("this is news");
}

@Test(priority=5,enabled=true)
public void SideMenueBar() throws InterruptedException 
{
	 driver.switchTo().frame("mainpanel");
	 Thread.sleep(5000);
	driver.findElement(By.xpath("//a [text()='Home']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a [text()='Add Boxes»']")).click();
	driver.findElement(By.xpath("//a [text()='Close']")).click();
	System.out.println("this is side menuebar");
}

@Test(priority=6,enabled=true)
public void Alert() throws InterruptedException 
{
	driver.findElement(By.xpath("//i [@class='fa fa-sign-out icon-2x']")).click();
}
@Test(priority=7,enabled=true)
public void logout() throws InterruptedException 
{
	driver.findElement(By.xpath("//a [text()='Alerts']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//option [text()='[A]ll users']")).click();
	
}
}
