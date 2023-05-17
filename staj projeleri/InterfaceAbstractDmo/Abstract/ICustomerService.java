package interfaceAbstractDmo.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface ICustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}