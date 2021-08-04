package FlyWeightPattern;

/*
 * 1. FlyWeigh��½Ķ���Ƕq�A�ت��b��`�ٰO����Ŷ��A���L�غc�X�Ӫ�����N�|�ʥF�u��
 * 2. �d�Ҥ��O�ϥ�Factory�h�غc�X����A�èϥ�Map�`�ٰO����
 * 3. �̱`�Ϊ��d�����ӬO�e�Ͻd�ҡA�гy�X�h�ӵe�Ϥ���ӹF��ت�
 */
public class FlyWeightPatternDemo {
	public static void main(String[] args) {
		Member member1 = MemberFactory.createMember("����", MemberRank.SENIOR);
		Member member2 = MemberFactory.createMember("�R�q", MemberRank.MIDDLE);
		Member member3 = MemberFactory.createMember("���a", MemberRank.JUNIOR);

		member1.printInformation();
		member2.printInformation();
		member3.printInformation();
	}
}
