package CommandPattern;

public class WriteFileCommand implements Command {
	private FileSystemReceiver fileSystenReceiver;

	public WriteFileCommand(FileSystemReceiver fileSystenReceiver) {
		this.fileSystenReceiver = fileSystenReceiver;
	}

	@Override
	public void execute() {
		this.fileSystenReceiver.writeFile();
	}
}
