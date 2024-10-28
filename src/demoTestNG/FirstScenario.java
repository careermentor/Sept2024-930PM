package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstScenario 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("this is my first testcase");
		
		Assert.assertEquals("Hello", "Hello1");
		
	}
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is my second testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
	}
	
	@Test(priority=0)
	public void forth_testcase()
	{
		System.out.println("this is my forth testcase");
	}
	
	@Test(priority=-2)
	public void fifth_testcase()
	{
		System.out.println("this is my fifth testcase");
	}
	
	@Test(priority=-1)
	public void sixth_testcase()
	{
		System.out.println("this is my sixth testcase");
	}
	
}
