package BuilderPattern;

/*
 * 1. 按照這個設計，物件一定得使用Builder去建構出來才行
 * 2. 建構出來的物件是immutable，是不可在變動的物件
 */
public class BuilderPatternDemo {
	Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
			.setBluetoothEnabled(true)
			.setGraphicsCardEnabled(true)
			.build();
}
