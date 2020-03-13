package factory_design.phone;

/**
 * @author Chalaka Hasantha
 *
 */
public class Android implements OperatingSystem {

	@Override
	public void specifications() {
		// Override specifications method
		System.out.print("Android OS : Free and Open Source / Supporting different CPU Architecture");
	}

}
