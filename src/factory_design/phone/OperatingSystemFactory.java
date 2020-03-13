package factory_design.phone;

/**
 * @author Chalaka Hasantha
 *
 */
public class OperatingSystemFactory {
	public OperatingSystem getInstance(String str) {
		if (str.equals("Best"))
			return new Android();
		else if (str.equals("Fast"))
			return new IOS();
		else
			return new Windows();
	}

}
