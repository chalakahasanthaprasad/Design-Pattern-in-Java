package builder_design.phone;

/**
 * @author Chalaka Hasantha
 *
 */
public class PhoneBuilder {
	private String OS;
	private String OS_Version;
	private String Processor;
	private int RAM;
	private int Battery;
	private double Screen_Size;

	// set setters
	public PhoneBuilder setOS(String oS) {
		OS = oS;
		return this;
	}

	public PhoneBuilder setOS_Version(String oS_Version) {
		OS_Version = oS_Version;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		Processor = processor;
		return this;
	}

	public PhoneBuilder setRAM(int rAM) {
		RAM = rAM;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		Battery = battery;
		return this;
	}

	public PhoneBuilder setScreen_Size(double screen_Size) {
		Screen_Size = screen_Size;
		return this;
	}

	public Phone getPhone() {
		return new Phone(OS, OS_Version, Processor, RAM, Battery, Screen_Size);

	}

}
