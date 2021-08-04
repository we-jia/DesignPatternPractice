package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollection {
	private List<Channel> list;

	public ChannelCollection() {
		list = new ArrayList<Channel>();
	}

	public void addChannel(Channel channel) {
		list.add(channel);
	}

	public void removeChannel(Channel channel) {
		list.remove(channel);
	}

	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, list);
	}

	private class ChannelIteratorImpl implements ChannelIterator {

		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
			this.channels = channels;
			this.type = type;
		}

		@Override
		public boolean hasNext() {
			while (position < channels.size()) {
				Channel c = channels.get(position);
				if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
					return true;
				} else {
					position++;
				}
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c = channels.get(position);
			position++;
			return c;
		}

	}
}
