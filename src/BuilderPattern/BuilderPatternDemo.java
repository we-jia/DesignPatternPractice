package BuilderPattern;

/*
 * 1. ���ӳo�ӳ]�p�A����@�w�o�ϥ�Builder�h�غc�X�Ӥ~��
 * 2. �غc�X�Ӫ�����Oimmutable�A�O���i�b�ܰʪ�����
 */
public class BuilderPatternDemo {
	Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
			.setBluetoothEnabled(true)
			.setGraphicsCardEnabled(true)
			.build();
}
