package oopsConcepts;

public class DemoStatic 
{
	static int x = 100;

	public static void printValX()
	{
		
		System.out.println(x);
	}
	
	public void printValY()
	{
		int y = 200;
		System.out.println(y);
	}
	
	
	public static void main(String[] args)
	{
		
		
		DemoStatic ds = new DemoStatic();
		ds.printValY();
		main(20);
		
	}
	
	public static void main(int a)
	{
		printValX();
		
		
	}
}
