package StrategyPattern;

/*
 * 1. �P�u�t�Ҧ����P���O�A�u�t�Ҧ����ت��b�󲣥X����A�����Ҧ��h�O���X�欰�A�ҥHpay�o�Ӱʧ@�èS���^�ǭ�
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
