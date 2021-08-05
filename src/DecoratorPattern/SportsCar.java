package DecoratorPattern;

public class SportsCar extends DecoratorCar {
	public SportsCar(Car car) {
		super(car);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sports Car.");
	}
}
