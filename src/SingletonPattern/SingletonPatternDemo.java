package SingletonPattern;

/*
 * 1. 可以用在logging物件、driver物件、cache物件、thread pool物件
 * 2. java.lang.Runtime是用singleton
 * 3. 如果強制地使用Reflection，可以破壞Singleton的結構，有人會建議使用enum來做
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
