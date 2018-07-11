/**
 *
 */
package OOPSConceptPart1;

/**
 * @author Madhu
 *
 */
public class Car {

//encapsulation
// while using class variables being used by other classes,
	//it is a best practice to use getter and setter methods from source. 
	private String engine;
	private int yearMake;
	private String model;
	
	// here two methods called get and set will be created for each variable.
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {  // here the engine variable is being obtained from carTest class.
		this.engine = engine;  // the variable engine on the left is the local variable in car class.
		// this key word is being used as the same variable assignment is being done.
	}
	public int getYearMake() {
		return yearMake;
	}
	public void setYearMake(int yearMake) {
		this.yearMake = yearMake;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	





}
