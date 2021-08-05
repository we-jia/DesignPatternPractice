package CommandPattern;

/*
 * 1. 這設計模式最大的優點在於，把呼叫哪一種Command，與Command實際上要做什麼，完全地隔離開來
 * 2. 不過類別的數量非常多，必須要在多看幾次去回想一下這個模式的建立方式
 * 3. 可以把Command想成三部分，Receiver、Command、Invoker
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
