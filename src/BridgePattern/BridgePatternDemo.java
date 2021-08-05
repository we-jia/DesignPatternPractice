package BridgePattern;

/*
 * 1. 與Adapter最大的不同在於，Adapter通常是兩個已經做好的東西，有可能是第三的套件，因此才需要做到轉接器
 * 2. Bridge的用法在於，這一整個程式架構"並沒有已經做好的東西"，完全由使用者在自行去設計
 * 3. 最終的目的也是做到解藕，把Shape中的Color獨立出來，做成一個interface
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		Shape rect = new Rectangle(new GreenColor());

		tri.applyColor();
		rect.applyColor();
	}
}
