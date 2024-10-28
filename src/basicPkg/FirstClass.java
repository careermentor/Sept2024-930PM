package basicPkg;


public class FirstClass
{
	String Bottle = "water";
	char a = 'X';
	int age = 40;
	float decnum = 40.5f;
	boolean b = false;
	
	public void printval()
	{
		System.out.println(Bottle);
		System.out.println(a);
		System.out.println(age);
		System.out.println(decnum);
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("this is main method");
		
		FirstClass abc = new FirstClass();
		abc.printval();
		
		
		
	}
	
}