package AbstractFactoryPattern;

public class PCFactory implements CompoterAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}
}
