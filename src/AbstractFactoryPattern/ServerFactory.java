package AbstractFactoryPattern;

public class ServerFactory implements CompoterAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(String ram, String hdd, String cpu) {
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}
}

