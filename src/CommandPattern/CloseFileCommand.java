package CommandPattern;

public class CloseFileCommand implements Command {
	private FileSystemReceiver fileSystenReceiver;

	public CloseFileCommand(FileSystemReceiver fileSystenReceiver) {
		this.fileSystenReceiver = fileSystenReceiver;
	}

	@Override
	public void execute() {
		this.fileSystenReceiver.closeFile();
	}
}
