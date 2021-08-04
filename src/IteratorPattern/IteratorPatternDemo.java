package IteratorPattern;

/*
 * 1. �i�H�ۦ�w�q���󪺶��X�A�w�q�n���󶰦X��A���I�b�󭡥N���覡�i�H�ۦ�w�q
 * 2. ���N��Iterator�i�H�w�q�������A�]���i�঳�Q�n�]�w���P�����N��k�A�o�ɨ̿�󤶭��A�|���~�����{���X���|��ﭡ�N�覡�����|�����D
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		ChannelCollection channels = populateChannels();
		ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}
		System.out.println("******");
		// Channel Type Iterator
		ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
		while (englishIterator.hasNext()) {
			Channel c = englishIterator.next();
			System.out.println(c.toString());
		}
	}

	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ChannelCollection();
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
		return channels;
	}
}
