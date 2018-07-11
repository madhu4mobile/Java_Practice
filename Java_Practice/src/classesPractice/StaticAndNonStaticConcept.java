package classesPractice;

public class StaticAndNonStaticConcept {
// www.youtube.com/watch?v=yQkbw66gt9I&t=40s
	// 	globals here
	String name = "My Name"; // non static global variable
	static int age = 25;     // static glosbal variable


	public static void main(String[] args) {
		// How to call static methods?
		// 1. direct calling;
		sum();
		// 2. calling by classname
		StaticAndNonStaticConcept.sum();
		
		// How to call static variables?
		// variables can be called direct or by classname
		System.out.println(age); // direct call
		System.out.println(StaticAndNonStaticConcept.age); // by class name

		// How to call Non-Static Methods
		//--> we need to create an object
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();   
		/*==>> Question. How the system know that the obj is linked to the nonStatic Method?*/
		// to call
		obj.sendMail();  //
		System.out.println(obj.name);  //-- global variable which is non-static
		//Q.  can we access static methods by using object reference? --> Yes. But we get a warning
		System.out.println(obj.age); // calling static global variable by obj reference
		obj.sum(); // direct calling works but a warning is produced.
		//The static method sum() from the type StaticAndNonStaticConcept should be accessed in a static way
		
		
		
		
		
	}

	public void sendMail() { // Non static method
		System.out.println("send mail method. - Non static");
	}

	public static void sum() { // staic method
		System.out.println("Sum Method");
	}
}
