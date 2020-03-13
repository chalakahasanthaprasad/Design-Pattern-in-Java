package builder_design.phone;

/**
 * @author Chalaka Hasantha
 *
 */
// Phone and Phone details
public class Phone {
	private String OS;
	private String OS_Version;
	private String Processor;
	private int RAM;
	private int Battery;
	private double Screen_Size;

	public Phone(String oS, String oS_Version, String processor, int rAM, int battery, double screen_Size) {
		super();
		OS = oS;
		OS_Version = oS_Version;
		Processor = processor;
		RAM = rAM;
		Battery = battery;
		Screen_Size = screen_Size;
	}

	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", OS_Version=" + OS_Version + ", Processor=" + Processor + ", RAM=" + RAM + "GB"
				+ ", Battery=" + Battery + "mAh" + ", Screen_Size=" + Screen_Size + "inch" + "]";
	}

}
