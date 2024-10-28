package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKeyboardMouseWindows 
{
		
	WebDriver driver;
	
	@Test(enabled=false)
	public void handleFrames() throws Exception
	{
		driver= new ChromeDriver();  //chrome browser
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
	
	
	}
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		driver= new ChromeDriver();  //chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		driver.switchTo().alert().accept();
		
		ResultsScreensshot.capturescreen(driver,"handleAlerts");
	
	}
	@Test(enabled=true)
	public void mouseOps() throws Exception
	{
		driver= new ChromeDriver();  //chrome browser
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();  //right click
	
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality Services')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality Services')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		Iterator<String> itr = winsid.iterator();
		String wins1 =itr.next();
		String wins2 =itr.next();
		//String wins3 =itr.next();
		
		driver.switchTo().window(wins2);	
		
		Thread.sleep(5000);
		
		ResultsScreensshot.capturescreen(driver,"mouseOps");
		
		
	}
	@Test(enabled=false)
	public void keyboardops()
	{
		driver= new ChromeDriver();  //chrome browser
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		//act.sendKeys("user1").perform();
		
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys("user2").perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass1234").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
	}
	
	
}
