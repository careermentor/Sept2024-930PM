package oopsConcepts;

public class CallAbsClassDemo extends AbsClassdemo
{

	
	public void m2() 
	{
	
		System.out.println("this is my credential");
	}

	public static void main(String[] args)
	{
	
		CallAbsClassDemo abc = new CallAbsClassDemo();
		abc.m1();
		abc.m2();
		
		
	}
	
}
