package ProxyPattern;

/*
 * 1. �ǥѥN�z�Ҧ��A�i�H�N���󥻨��Q�����Ʊ��A�]�q�b�t�@�Ӫ��󤤡A�ӥt�@�Ӫ���h�i�H�h�w�q�ӥ~�Q�����Ʊ�
 * 2. �̱`�����Ҥl�N�O�glog
 * 3. �q�`�N�z�H��D�n��class�A��������@�ۦP�������A���H���ާ@�P�˪F�誺�Pı
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Character cha = new Jotaro();
		CharacterProxy chaProxy = new CharacterProxy(cha);
		chaProxy.attack();
	}

}
