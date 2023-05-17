package polymorphisim;

public class ConsoleLogger extends BaseLogger{
	public void Log(String message) {
		System.out.println("logged to Console : " + message);
	}

}
