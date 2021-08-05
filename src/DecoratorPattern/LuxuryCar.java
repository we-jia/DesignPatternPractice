package DecoratorPattern;

public class LuxuryCar extends DecoratorCar {
	public LuxuryCar(Car car) {
		super(car);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Luxury Car.");
	}
}
