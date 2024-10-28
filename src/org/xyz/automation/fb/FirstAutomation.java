package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
		
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new EdgeDriver();  //edge browser
		driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

	@Test
	public void login_functionality()
	{
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.name("pass")).sendKeys("pass1244");
		
		boolean x = driver.findElement(By.cssSelector("[type='submit']")).isEnabled();
		System.out.println(x);
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Test
	public void signup_functionality() throws Exception
	{
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		
		boolean y = driver.findElement(By.xpath("//*[text()='Female']")).isSelected();
		System.out.println(y);
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
}
