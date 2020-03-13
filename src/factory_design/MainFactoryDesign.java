//Factory Design pattern Main class
/*Factory pattern is one of the most used design patterns in Java. 
  This type of design pattern comes under creational pattern as 
  this pattern provides one of the best ways to create an object.

  In Factory pattern, we create object without exposing the creation logic 
  to the client and refer to newly created object using a common interface.*/
package factory_design;

/**
 * @author Chalaka Hasantha
 *
 */
import java.util.Scanner;

import factory_design.phone.OperatingSystem;
import factory_design.phone.OperatingSystemFactory;

public class MainFactoryDesign {

	public static void main(String[] args) {
		String input;
		OperatingSystemFactory OSF = new OperatingSystemFactory();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your choise (Best / Fast / anything): ");
		input = scan.nextLine();

		// OperatingSystem Interface --> OperatingSystemFactory
		OperatingSystem OS = OSF.getInstance(input);
		OS.specifications();

	}

}
