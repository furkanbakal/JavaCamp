package Adaptors;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoap client= new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		
		
	}

}
