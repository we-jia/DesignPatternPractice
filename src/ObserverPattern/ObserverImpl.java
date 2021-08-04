package ObserverPattern;

public class ObserverImpl implements Observer {

	@Override
	public void update(Subject subject) {
		System.out.println("獲得通知" + subject.getMessage());
	}

}
