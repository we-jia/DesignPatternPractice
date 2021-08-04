package FlyWeightPattern;

public class Welfare {
	private int payment;

	private int payedVacation;

	public Welfare(int payment, int payedVacation) {
		this.payment = payment;
		this.payedVacation = payedVacation;
	}

	public int getPayment() {
		return payment;
	}

	public int getPayedVacation() {
		return payedVacation;
	}
	
}
