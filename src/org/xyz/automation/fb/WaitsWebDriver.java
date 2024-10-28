package org.xyz.automation.fb;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsWebDriver 
{
		
	WebDriver driver;
		
	@Test
	public void loginPage() throws Exception
	{
		driver= new ChromeDriver();  //edge browser
		
		driver.get("https://www.mphasis.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		Set<String> winsid = driver.getWindowHandles();
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win1);
		
		/*
		
		driver.findElement(By.name("fld_username")).sendKeys("user1");
		
		Select con = new Select(driver.findElement(By.name("country")));
		
		con.selectByVisibleText("Bahrain");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Hidd"));
		
		st.selectByVisibleText("Manama");
		*/
	}	
	
	
	
}
