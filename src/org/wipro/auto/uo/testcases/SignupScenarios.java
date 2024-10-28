package org.wipro.auto.uo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InitiateBrowser;
import org.wipro.auto.uo.pages.SignupPage;

public class SignupScenarios extends InitiateBrowser
{

	@Test
	public void tc02_signup_registration_validation() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		
		sign.enter_firstname("John");
		sign.select_dob_day("18");
		sign.click_gen_male();
		sign.click_signupbttn();
		
		driver.findElement(By.id("email")).sendKeys("user1");
		
	}
	
}
