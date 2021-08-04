package ProxyPattern;

public class CharacterProxy implements Character {
	private Character character;

	public CharacterProxy(Character character) {
		this.character = character;
	}

	@Override
	public void attack() {
		System.out.println("µo°Ê§ğÀ»");
		character.attack();
	}

}
