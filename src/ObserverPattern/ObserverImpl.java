package ObserverPattern;

public class ObserverImpl implements Observer {

	@Override
	public void update(Subject subject) {
		System.out.println("��o�q��" + subject.getMessage());
	}

}
