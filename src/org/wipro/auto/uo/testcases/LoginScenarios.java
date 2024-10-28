package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InitiateBrowser;

import org.wipro.auto.uo.datagenerator.TestDataGenerators;
import org.wipro.auto.uo.pages.LoginPage;

public class LoginScenarios extends InitiateBrowser
{

	@Test(dataProvider="LION",dataProviderClass=TestDataGenerators.class)
	public void tc01_validate_validcredntail_loginfunc(String username, String password ) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
}
