package org.wipro.auto.uo.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.uo.utilitiesPkg.ReadPropFileData;

public class InitiateBrowser 
{
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropFileData.readconfigdata("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			
		}
		
		else if(ReadPropFileData.readconfigdata("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		else
		{
			driver = new ChromeDriver();
			
		}
		
		driver.get(ReadPropFileData.readconfigdata("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
