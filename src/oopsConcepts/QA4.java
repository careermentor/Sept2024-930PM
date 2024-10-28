package oopsConcepts;

public class QA4 extends QA2 implements QA3I
{


	
	public void div(int a, int b)
	{
	
		int c = a/b;
		System.out.println("division of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
		
		QA4 q4 = new QA4();
		q4.div(40, 20);
		q4.sub(30, 40);
		//q4.sum(20, 30);
	}

	
	public void m_qa3i() {
		System.out.println("QA3I_method");
		
	}
	
}
