package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	List<User> users = new ArrayList<>();

	@Override
	public void sendMessage(String msg, User user) {
		users.stream().forEach((u) -> {
			if (u != user) {
				u.receive(msg);
			}
		});
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}
}
