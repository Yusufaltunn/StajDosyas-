package interfaceAbstractDmo.Concrete;

import interfaceAbstractDmo.Abstract.ICustomerCheckService;
import interfaceAbstractDmo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
	
}