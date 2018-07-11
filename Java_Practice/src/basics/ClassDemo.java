package basics;

public class ClassDemo 
{// Global variables here
	int x = 90;
	int y = 70;
	public static void main(String[] args)
	{
		System.out.println("Welcome!!!. We will start using the object of the class");
		
		ClassDemo obj1 = new ClassDemo();
		
		obj1.sum();
		System.out.println("Values called from the sum method");
		
		System.out.println("X value called from data declaration is "+ obj1.x);
		System.out.println("Y value called from data declaration is "+ obj1.y);
		
		System.out.println("Program ends!");

	}

	public void sum() 
	{ // local variables here.
		int a = 90;
		int b = 100;
		int c = a + b;
		System.out.println("Sum of the two local variables is "+c);
		
	}
}
