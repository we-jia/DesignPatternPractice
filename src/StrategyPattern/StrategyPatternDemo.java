package StrategyPattern;

/*
 * 1. 與工廠模式不同的是，工廠模式的目的在於產出物件，策略模式則是做出行為，所以pay這個動作並沒有回傳值
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		// pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

		// pay by credit card
		cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}
}
