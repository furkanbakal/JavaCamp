package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private  CustomerCheckService customerCheckService;
	
	
	
	
	public StarbucksCustomerManager(CustomerCheckService  customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}



	@Override
	public void save(Customer customer) {
		try {
			if(customerCheckService.CheckIfRealPerson(customer))
			{
				super.save(customer);
			}
			else
			{
				System.out.println("Not a valid person.");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
