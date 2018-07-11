/**
 * 
 */
package constructorsExample;

/**
 * @author Madhu
 * This links with Animal class.
 * Need to know the name of Animal classm  <<---->>
 */
public class Zoo {
	public static void main(String[] args) {
		// Here we initiate the new animal tiger from parent class Animal();
		Animal tiger = new Animal(6, "Male", 50);
		// now invoke tiger
		if (tiger.age <10 && tiger.weightInLbs < 80) {
			tiger.eat();
		}
		// creating new bird parrot
		Bird parrot = new Bird();
 
	}

}
