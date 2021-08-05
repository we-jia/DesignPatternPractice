package CommandPattern;

/*
 * 1. �o�]�p�Ҧ��̤j���u�I�b��A��I�s���@��Command�A�PCommand��ڤW�n������A�����a�j���}��
 * 2. ���L���O���ƶq�D�`�h�A�����n�b�h�ݴX���h�^�Q�@�U�o�ӼҦ����إߤ覡
 * 3. �i�H��Command�Q���T�����AReceiver�BCommand�BInvoker
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

		OpenFileCommand openFileCommand = new OpenFileCommand(fs);

		FileInvoker file = new FileInvoker(openFileCommand);

		file.execute();

		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();

		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}
}
