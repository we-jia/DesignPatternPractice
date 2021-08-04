package AdapterPattern;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		return this.getVolt();
	}

	@Override
	public Volt get12Volt() {
		return this.convertVolt(this.getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		return this.convertVolt(this.getVolt(), 40);
	}

	private Volt convertVolt(Volt volt, int i) {
		return new Volt(volt.getVolts() / i);
	}
}
