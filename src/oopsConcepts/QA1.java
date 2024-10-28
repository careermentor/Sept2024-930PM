package oopsConcepts;

public class QA1
{
	
	int x =500;  //global variable 

	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum of a&b: " + c);
		
		
	}
	
	public void meth2()
	{
		System.out.println(x);  
	}
	
	public static void main(String[] args) {
		
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		
		DemoStatic.printValX();
	}
	
}
