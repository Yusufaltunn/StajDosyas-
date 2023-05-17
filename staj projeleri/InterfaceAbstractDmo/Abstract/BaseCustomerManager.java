package interfaceAbstractDmo.Abstract;

import interfaceAbstractDsmo.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) throws Exception {
		System.out.println("Saved to db: " + customer.getFirstName());
		
	}

}