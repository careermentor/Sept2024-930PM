package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.uo.utilitiesPkg.ReadPropFileData;

public class SignupPage 
{

	WebDriver driver;  //global variable
	
	
	public SignupPage(WebDriver driver) //local variable
	{
		this.driver=driver;
	}
	
	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFileData.readproperties("login_createnewaccount_xpath"))).click();
		
	}

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFileData.readproperties("signup_firstname_name"))).sendKeys(fname);
		
	}
	
	public void select_dob_day(String dob_d) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFileData.readproperties("signup_dob_day_name"))));
		dob_day.selectByVisibleText(dob_d);
		
	}
	
	public void click_gen_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFileData.readproperties("signup_male_xpath"))).click();
		
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFileData.readproperties("signup_signupbttn_name"))).click();
		
	}
	
}
