package oopsConcepts;

public class CallDemoInterface implements DemoInterface
{

	
	public void m3() {
		
		System.out.println("method m3");
	}

	
	public void m4() {
		System.out.println("method m4");
	
		
	}

	public static void main(String[] args) {
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.m3();
		cdi.m4();
	}
	
	
}
