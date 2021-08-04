package ObserverPattern;

public interface Subject {
	public void register(Observer observer);

	public void unRegister(Observer observer);

	public void notifyOberver();
	
	public void postMessage(String message);
	
	public String getMessage();
}
