package org.xyz.automation.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BrowserHandle 
{
		
	WebDriver driver;
	

	
	@Test
	public void selectCalendar() throws Exception
	{
		driver= new ChromeDriver();  //edge browser
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		
		driver.findElement(By.id("datepicker")).sendKeys("07/18/1981");
		driver.findElement(By.xpath("//a[text()='18']")).click();
		
	
	}
	
	@Test(enabled=false)
	public void differentbttns() throws Exception
	{
		driver= new ChromeDriver();  //edge browser
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		driver.findElement(By.name("terms"));
		/*
		
		driver.findElement(By.className("displayPopup")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[class='close']")).click();
		*/
		
		WebElement x = driver.findElement(By.name("sex"));
		Select gen = new Select(x);
		
		//------------------This is to display all the dropdown options
		
		List<WebElement> y = gen.getOptions();
		int a = y.size();  //3
		
		System.out.println(a); //3
		
		System.out.println("Dropdown values are:");
		
        for (int i = 0; i<a ; i++)  //0 , 0<<3
        {
        	WebElement z = y.get(i);
        	
            System.out.println(z.getText());  // Use getText() for visible text
            // System.out.println(option.getAttribute("value")); // Use getAttribute("value") for the 'value' attribute
        }
		
        //-------------------------------------
		
		
		//gen.selectByIndex(1);  //Male
		//gen.selectByValue("2");  //Female
		gen.selectByVisibleText("Male");
		
		//driver.findElement(By.xpath("//select[@name='sex']/option[@value='2']")).click();
	
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		
		//con.deselectAll();
		//con.deselectByIndex(1);
		
		
		
	}
	
	@Test(enabled=false)
	public void login() throws Exception
	{
		driver= new ChromeDriver();  //edge browser
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("User1");
		//driver.findElement(By.id("email")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("User2");
	}
	
	@Test(enabled=false)
	public void launchBrowser() throws Exception
	{
		driver= new ChromeDriver();  //edge browser
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//driver.close();  //close one window 
		driver.quit();  //close all the window which is open by automation
		
	}
	
	
	
}
