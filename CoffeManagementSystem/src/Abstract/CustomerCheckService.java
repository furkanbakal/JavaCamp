package Abstract;

import java.rmi.RemoteException;

import Entity.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws RemoteException, NumberFormatException;
		
}
