package Concrete;

import Adaptors.MernisServiceAdaptor;
import Entities.Gamer;
import Interfaces.GamerCheckService;

public class GamerCheckManager extends MernisServiceAdaptor{

	
	public void Check(Gamer gamer) {
		// TODO Auto-generated method stub
		super.CheckIfRealPerson(gamer);
	}

}
