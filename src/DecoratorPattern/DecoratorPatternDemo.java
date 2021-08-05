package DecoratorPattern;

/*
 * 1. 跟Composite會有點類似，不過Composite是使用聚合的概念來完成，也就是需要多出一個list去做整理
 * 2. Decorator的做法是使用繼承的概念去完成，可以看到裝飾者中有一個interface，那個interface會建構物件時進行注入
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
