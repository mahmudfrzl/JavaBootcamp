package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer mahmud = new Customer(1,"Mahmud","Ferzeli");
		customerManager.add(mahmud);

	}

}
