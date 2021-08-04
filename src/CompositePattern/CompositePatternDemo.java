package CompositePattern;

/*
 * 1. 各個小組件都會實作interface，而所謂的組合模式，就是把小組件聚合成一個大組件，
 * 而這個大組件同時也要實作interface，他的實作就直接呼叫內部聚合的組件即可
 */
public class CompositePatternDemo {
	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);

		drawing.draw("Red");
		drawing.clear();

		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}
}
