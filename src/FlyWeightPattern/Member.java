package FlyWeightPattern;

public class Member {
	public String name;

	public Welfare welfare;

	public MemberRank rank;

	public Member(String name, Welfare welfare, MemberRank rank) {
		this.name = name;
		this.welfare = welfare;
		this.rank = rank;
	}

	public void printInformation() {
		System.out.println("name: " + this.name);
		System.out.println("rank: " + this.rank);
		System.out.println("payment: " + this.welfare.getPayment());
		System.out.println("payedVacation: " + this.welfare.getPayedVacation());
	}
}
