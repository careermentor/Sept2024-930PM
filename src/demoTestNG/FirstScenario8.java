package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario8 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is my first testcase");
	}
	@Test
	public void second_testcase()
	{
		System.out.println("this is my second testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
	}
	
	@Test(groups="Sanity")
	public void forth_testcase()
	{
		System.out.println("this is my forth testcase");
	}
	
	@Test(groups="Regression")
	public void fifth_testcase()
	{
		System.out.println("this is my fifth testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is my sixth testcase");
		Assert.assertEquals("Hello", "Hello1");
	}
	
}
