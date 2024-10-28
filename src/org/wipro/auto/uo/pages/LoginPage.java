package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.auto.uo.utilitiesPkg.ReadPropFileData;

public class LoginPage 
{

	WebDriver driver;  //global variable
	
	public LoginPage(WebDriver driver) //local variable
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFileData.readproperties("login_username_id"))).sendKeys(uname);
		
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFileData.readproperties("login_password_name"))).sendKeys(pass);
		
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFileData.readproperties("login_loginbtn_xpath"))).click();
		
	}
	
}
