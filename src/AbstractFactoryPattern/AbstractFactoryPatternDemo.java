package AbstractFactoryPattern;

/*
 * 1. 在簡單工廠中，要新增一個物件，會需要改變工廠的內容，也就是要覆寫switch的部分，但在抽象工廠替換成類別，只要新增實作的類別即可。
 * 2. 另一個很特別的點在於，他有個"專門建立工廠的工廠"，這讓程式碼更高度的依賴於抽象而不是實體。
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory
				.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory
				.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
	}
}
