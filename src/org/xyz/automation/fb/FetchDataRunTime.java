package org.xyz.automation.fb;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRunTime 
{
		
	WebDriver driver;
		
	@Test
	public void loginPage() throws Exception
	{
		driver= new ChromeDriver();  //edge browser
		
		String ExpURL = "https://thetestingworld.com/testings";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);
		
		
		String ExpTitle = "Login & Sign Up Forms";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpTab = "Register";
		
		String ActTab = driver.findElement(By.xpath("//label[text()='Register']")).getText();
		System.out.println(ActTab);
		Assert.assertEquals(ActTab, ExpTab);
		
		String Expusernamefield = "myusername";
		
		String Actusernamefield = driver.findElement(By.name("fld_username")).getAttribute("placeholder");
		
		sa.assertEquals(Actusernamefield, Expusernamefield);
		
		Point loginLoc = driver.findElement(By.xpath("//input[@value='Sign up']")).getLocation();
		
		System.out.println(loginLoc);
		System.out.println(driver.getPageSource());
		
		boolean x = driver.findElement(By.xpath("//input[@value='Sign up']")).isEnabled();
		System.out.println(x);
		
		boolean y =driver.findElement(By.name("terms")).isSelected();
		System.out.println(y);
		
		//Assert.ass
		
		sa.assertAll();
		
	}	
	
	
	
}
