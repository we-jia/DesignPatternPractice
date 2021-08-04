package AbstractFactoryPattern;

public class ComputerFactory {
	private ComputerFactory() {}
	
	public static Computer getComputer(CompoterAbstractFactory computerAbstractFactory) {
		return computerAbstractFactory.createComputer();
	}
}
