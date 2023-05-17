package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer yusuf = new Customer(1,"yusuf","altun");
		customerManager.add(yusuf);

	}

}
