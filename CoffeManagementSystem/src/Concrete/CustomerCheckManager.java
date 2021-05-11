package Concrete;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entity.Customer;


public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException, NumberFormatException {
	
		return true;
	}

	
}
