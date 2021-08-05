package DecoratorPattern;

/*
 * 1. ��Composite�|���I�����A���LComposite�O�ϥλE�X�������ӧ����A�]�N�O�ݭn�h�X�@��list�h����z
 * 2. Decorator�����k�O�ϥ��~�Ӫ������h�����A�i�H�ݨ�˹��̤����@��interface�A����interface�|�غc����ɶi��`�J
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
