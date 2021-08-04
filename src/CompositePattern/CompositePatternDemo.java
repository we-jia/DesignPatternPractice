package CompositePattern;

/*
 * 1. �U�Ӥp�ե󳣷|��@interface�A�өҿת��զX�Ҧ��A�N�O��p�ե�E�X���@�Ӥj�ե�A
 * �ӳo�Ӥj�ե�P�ɤ]�n��@interface�A�L����@�N�����I�s�����E�X���ե�Y�i
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
