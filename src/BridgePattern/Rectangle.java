package BridgePattern;

public class Rectangle extends Shape {
	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Rectangle filled with color ");
		color.applyColor();
	}
}
