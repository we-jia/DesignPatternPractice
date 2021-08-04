package FlyWeightPattern;

/*
 * 1. FlyWeigh的翻譯為蠅量，目的在於節省記憶體空間，不過建構出來的物件就會缺乏彈性
 * 2. 範例中是使用Factory去建構出物件，並使用Map節省記憶體
 * 3. 最常用的範例應該是畫圖範例，創造出多個畫圖元件而達到目的
 */
public class FlyWeightPatternDemo {
	public static void main(String[] args) {
		Member member1 = MemberFactory.createMember("狗毛", MemberRank.SENIOR);
		Member member2 = MemberFactory.createMember("吐司", MemberRank.MIDDLE);
		Member member3 = MemberFactory.createMember("尾家", MemberRank.JUNIOR);

		member1.printInformation();
		member2.printInformation();
		member3.printInformation();
	}
}
