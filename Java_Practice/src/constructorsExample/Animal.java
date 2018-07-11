/**
 * 
 */
package constructorsExample;

/**
 * This class has the attributes of Animal class.
 * @author Madhu
 *
 */
public class Animal {

	/**
	 * @param args

	 * globals initiated here
	 */
	int age;
	String gender;
	int weightInLbs;
// This class will not have the main method...???????
	public Animal (int age, String gender, int weightInLbs) {
		// this is called the constructor <<----need to know about this--->>
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
		}
	public void eat() {
		System.out.println("Eating...!!");
	}
	public void sleep() {
		System.out.println("Sleeping...!!");
	}
	

}
