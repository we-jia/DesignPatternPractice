package MediatorPattern;

public class UserImpl implements User {
	private ChatMediator chatMediator;
	private String userName;

	public UserImpl(ChatMediator chatMediator, String userName) {
		this.chatMediator = chatMediator;
		this.userName = userName;
	}

	@Override
	public void send(String message) {
		chatMediator.sendMessage(message, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(userName + " receive:" + msg);
	}
}
