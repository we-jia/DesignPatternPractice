package BridgePattern;

/*
 * 1. �PAdapter�̤j�����P�b��AAdapter�q�`�O��Ӥw�g���n���F��A���i��O�ĤT���M��A�]���~�ݭn�����౵��
 * 2. Bridge���Ϊk�b��A�o�@��ӵ{���[�c"�èS���w�g���n���F��"�A�����ѨϥΪ̦b�ۦ�h�]�p
 * 3. �̲ת��ت��]�O������¡A��Shape����Color�W�ߥX�ӡA�����@��interface
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		Shape rect = new Rectangle(new GreenColor());

		tri.applyColor();
		rect.applyColor();
	}
}
