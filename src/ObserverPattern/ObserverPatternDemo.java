package ObserverPattern;

/*
 * 1. Observer總共有多個，而Subject只有一個
 * 2. 當Subject有所變化時，要主動通知所有的Observer，所以在建立物件時，必須要建立可以聚合Observer的方法
 * 3. Subject與Observer要能夠互相參照到對方的物件
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		// create subject
		Subject subject = new SubjectImpl();

		// create observers
		Observer obj1 = new ObserverImpl();
		Observer obj2 = new ObserverImpl();
		Observer obj3 = new ObserverImpl();

		// register observers to the subject
		subject.register(obj1);
		subject.register(obj2);
		subject.register(obj3);

		subject.postMessage("HelloWorld");
	}
}
