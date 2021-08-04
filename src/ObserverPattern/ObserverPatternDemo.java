package ObserverPattern;

/*
 * 1. Observer�`�@���h�ӡA��Subject�u���@��
 * 2. ��Subject�����ܤƮɡA�n�D�ʳq���Ҧ���Observer�A�ҥH�b�إߪ���ɡA�����n�إߥi�H�E�XObserver����k
 * 3. Subject�PObserver�n������۰ѷӨ��誺����
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
