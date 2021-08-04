package SimpleFactoryPattern;

public class SimpleFactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("Rectangular");
		shape2.draw();
	}
}