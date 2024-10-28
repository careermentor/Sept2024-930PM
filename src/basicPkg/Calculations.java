package basicPkg;

 public class Calculations 
{
	 int a = 20;  //global variable
	 
	 
	  public void sum()
	{
			Maths ma = new Maths(40,50);
			ma.addition();
		 final int a = 200; //local variable
		// a=300;
		
		System.out.println(a);  //200
		
		int b = 30;
		
		int c = a+b;
		
		System.out.println(c);
		System.out.println("This is sum of a&b: "+c);
		
		System.out.println(a+b);  //50
		System.out.println(a+"b");//20b
		System.out.println(30+40);
		
	}
	 
	 public void printst()
	 {
		 System.out.println("this is a main method");
		 
		 System.out.println(a);  //20
	 }
	
	public static void main(String[] args) 
	{
		Calculations xyz = new Calculations();  //object of the class
		
		xyz.sum();
		
		xyz.printst();
		
	}
	
}
