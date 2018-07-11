package basics;

public class SecondClassDemo {

	public static void main(String[] args) {
		// this class uses the calculator class

		Calculator obj1 = new Calculator();

		obj1.sub();
		obj1.sum();

		// if you want to call the vairables declared in calculator use . operator
		// obj1.Name = "Madhu"; //-- if you want to change the value of name here.
		// Otherwise name is taken from calculator class
		System.out.println("Name is " + obj1.Name);
		// everything is case sensitive so obj1.name throws error
		System.out.println("Hobby is " + obj1.Hobby);

	}

}
