package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	private List<Shape> shapes = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		shapes.stream()
		      .forEach(sr -> sr.draw(fillColor));
	}
	
	public void add(Shape s) {
		this.shapes.add(s);
	}
	
	public void remove(Shape s) {
		this.shapes.remove(s);
	}
	
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
