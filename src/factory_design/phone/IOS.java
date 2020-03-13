package factory_design.phone;

/**
 * @author Chalaka Hasantha
 *
 */
public class IOS implements OperatingSystem {

	@Override
	public void specifications() {
		// Override specifications method
		System.out.print("iOS OS : Stable / Perfect Memory Managment ");
	}

}
