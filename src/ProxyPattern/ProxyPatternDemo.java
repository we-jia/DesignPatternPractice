package ProxyPattern;

/*
 * 1. 藉由代理模式，可以將物件本身想做的事情，包裹在另一個物件中，而另一個物件則可以去定義而外想做的事情
 * 2. 最常見的例子就是寫log
 * 3. 通常代理人跟主要的class，都必須實作相同的介面，讓人有操作同樣東西的感覺
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Character cha = new Jotaro();
		CharacterProxy chaProxy = new CharacterProxy(cha);
		chaProxy.attack();
	}

}
