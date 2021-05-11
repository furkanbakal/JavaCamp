import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdaptor;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager=new NeroCustomerManager(new MernisServiceAdaptor());
		baseCustomerManager.save(new Customer(0,"furkan","bakal",1997,"45370018750"));
	}

}
