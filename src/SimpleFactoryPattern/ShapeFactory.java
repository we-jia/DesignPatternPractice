package SimpleFactoryPattern;

public class ShapeFactory {
	public Shape getShape(String shape) {
		switch (shape) {
		case "Circle":
			return new Circle();
		case "Rectangular":
			return new Rectangular();
		}
		return null;
	}
}
