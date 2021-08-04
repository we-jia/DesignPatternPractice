package SingletonPattern;

/*
 * 1. �i�H�Φblogging����Bdriver����Bcache����Bthread pool����
 * 2. java.lang.Runtime�O��singleton
 * 3. �p�G�j��a�ϥ�Reflection�A�i�H�}�aSingleton�����c�A���H�|��ĳ�ϥ�enum�Ӱ�
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
