package demoTestNG;

import org.testng.annotations.Test;

public class FirstScenario3 
{

	@Test(enabled=true)
	public void first_testcase()
	{
		System.out.println("this is my first testcase");
	}
	@Test(groups={"Regression","Sanity"})
	public void second_testcase()
	{
		System.out.println("this is my second testcase");
		
	}
	
	@Test(groups="Regression")
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("this is my forth testcase");
	}
	
	@Test(groups="Smoke")
	public void fifth_testcase()
	{
		System.out.println("this is my fifth testcase");
	}
	
	@Test(groups="Sanity")
	public void sixth_testcase()
	{
		System.out.println("this is my sixth testcase");
	}
	
}
