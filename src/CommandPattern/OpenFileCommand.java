package CommandPattern;

public class OpenFileCommand implements Command {
	private FileSystemReceiver fileSystenReceiver;

	public OpenFileCommand(FileSystemReceiver fileSystenReceiver) {
		this.fileSystenReceiver = fileSystenReceiver;
	}

	@Override
	public void execute() {
		this.fileSystenReceiver.openFile();
	}
}
