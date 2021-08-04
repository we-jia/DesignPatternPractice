package MediatorPattern;

/*
 * 1. �PObserverPattern���P���a��O�AObserver���ӥD�D�A�D�D�|�D�ʵo�e�F��X��
 * 2. Mediator�����k�O�j�a���O�������A�N����ѫǤ@�ˡA��ѫǪ��Ҧ��H���i�H�z�L��ѫǵo�e�T������L�H
 * 3. �өҿת���ѫǡA�]�N�O������Mediator
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
