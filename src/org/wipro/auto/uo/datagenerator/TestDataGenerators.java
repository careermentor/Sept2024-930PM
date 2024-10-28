package org.wipro.auto.uo.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerators 
{


	@DataProvider(name="DDF")
	public Object[][] testdata()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};
		
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data3;
	}
	
	@DataProvider(name="LION")
	public Object[][] testdata1()
	{
		
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data3;
	}
	
	
}
