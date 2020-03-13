//Builder Design pattern Main class
/*Builder pattern builds a complex object using simple objects and using a step by step approach. 
 * This type of design pattern comes under creational pattern as this pattern provides 
 * one of the best ways to create an object*/

package builder_design.phone;

/**
 * @author Chalaka Hasantha
 *
 */
public class PhoneShop {

	public static void main(String[] args) {
		Phone sp = new PhoneBuilder().setOS("Android").setOS_Version("Q").setRAM(4).setProcessor("Snapdragon")
				.getPhone();
		System.out.print(sp);

	}

}
