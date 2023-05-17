import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Yusuf", "Altun", "1999-6-4", "111111"));
	}
		

}

