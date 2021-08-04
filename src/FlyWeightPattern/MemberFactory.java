package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MemberFactory {
	private static Map<MemberRank, Member> map = new HashMap<>();

	private MemberFactory() {
	}

	public static Member createMember(String name, MemberRank memberRank) {
		Member member = map.get(memberRank);
		if (!Objects.isNull(member)) {
			return member;
		}

		Welfare welfare;
		switch (memberRank) {
		case JUNIOR:
			welfare = new Welfare(40000, 5);
			member = new Member(name, welfare, MemberRank.JUNIOR);
			break;
		case MIDDLE:
			welfare = new Welfare(50000, 7);
			member = new Member(name, welfare, MemberRank.MIDDLE);
			break;
		case SENIOR:
			welfare = new Welfare(60000, 10);
			member = new Member(name, welfare, MemberRank.SENIOR);
			break;
		default:
			welfare = new Welfare(40000, 5);
			member = new Member(name, welfare, MemberRank.JUNIOR);
		}
		return member;
	}
}
