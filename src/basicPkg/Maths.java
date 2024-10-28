package basicPkg;

public class Maths 
{

	
	public Maths()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("constructor1 output: " + c);
		
		
	}
	
	public Maths(int a, int b)
	{
		int c = a+b;
		System.out.println("constructor2 output: " + c);
	}
	
	public int addition()  //without parameters/arguments
	{
		//String name = "Santosh";
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		return a;
		
	}
	
	public int sum(int a, int b)  //with parameters/arguments
	{
	
		int c = a+b;
		
		System.out.println("value of c: " + c);
		return c;
		
		
		//20+30+40
		//int y = 20+30
			//	y+40
		
	}
	
	public static void main(String[] args) 
	{
		Maths ma = new Maths(40,50);
		
		Maths ma1 = new Maths();
		
		int x = ma1.addition();
		
		ma.sum(x, 40);
		int y = ma.sum(20, 30);
		ma.sum(y, 40);
		
	}
	
}
