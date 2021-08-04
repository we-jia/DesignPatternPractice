package MediatorPattern;

/*
 * 1. 與ObserverPattern不同的地方是，Observer有個主題，主題會主動發送東西出來
 * 2. Mediator的做法是大家都是等價的，就像聊天室一樣，聊天室的所有人都可以透過聊天室發送訊息給其他人
 * 3. 而所謂的聊天室，也就是中介者Mediator
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");
	}
}
