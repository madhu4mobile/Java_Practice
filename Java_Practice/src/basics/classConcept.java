package basics;

public class classConcept {
// class variables - also called as global variables
	String modelName;
	int yearMake;
	String engine;
	public static void main(String[] args) {
		// To initate the objects of new cars.
		classConcept a = new classConcept();
		classConcept b = new classConcept();
		classConcept c = new classConcept();
		// assigninging values
		a.modelName = "Nissan Versa";
		a.yearMake = 2016;
		a.engine = "v3";
		
		b.modelName = "Infinity QX60";
		b.yearMake = 2015;
		b.engine = "v6";
		
		b.modelName = "Honda Accord ";
		b.yearMake = 2012;
		b.engine = "v2";
		//Calling
		System.out.println(a.modelName);
		System.out.println(a.yearMake);
		System.out.println(a.engine);
		
		
		
		
		
	}

}
