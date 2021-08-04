package AbstractFactoryPattern;

/*
 * 1. �b²��u�t���A�n�s�W�@�Ӫ���A�|�ݭn���ܤu�t�����e�A�]�N�O�n�мgswitch�������A���b��H�u�t���������O�A�u�n�s�W��@�����O�Y�i�C
 * 2. �t�@�ӫܯS�O���I�b��A�L����"�M���إߤu�t���u�t"�A�o���{���X�󰪫ת��̿���H�Ӥ��O����C
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory
				.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory
				.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
	}
}
