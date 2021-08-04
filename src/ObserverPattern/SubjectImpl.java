package ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubjectImpl implements Subject {

	List<Observer> list = new ArrayList<>();
	private String message;

	@Override
	public void register(Observer observer) {
		if (Objects.isNull(observer)) {
			throw new NullPointerException("Null Observer");
		}
		synchronized (this) {
			list.add(observer);
		}
	}

	@Override
	public synchronized void unRegister(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyOberver() {
		list.stream().forEach(observer -> {
			observer.update(this);
		});
	}

	@Override
	public void postMessage(String message) {
		this.message = message;
		this.notifyOberver();
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
