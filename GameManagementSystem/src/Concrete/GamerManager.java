package Concrete;

import Entities.Gamer;
import Interfaces.GamerService;

public class GamerManager implements GamerService{

	@Override
	public void sign(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adlý kullanýcý kaydedildi.");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adlý kullanýcý güncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adlý kullanýcý silindi");
	}
	
}
