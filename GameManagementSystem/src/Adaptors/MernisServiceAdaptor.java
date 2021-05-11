package Adaptors;

import java.rmi.RemoteException;

import Entities.Gamer;
import Interfaces.GamerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		boolean check = false;
		
		KPSPublicSoapProxy checkPerson=new KPSPublicSoapProxy();
		
		try {
			check=checkPerson.TCKimlikNoDogrula(Long.parseLong(gamer.getEntitiyId()), gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),gamer.getBirthOfDate());
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return check;
	}
	
}
