package Core.concretes;

import Core.abstracts.ValidatorService;
import Entities.concretes.User;

public class NameValidator implements ValidatorService{

	@Override
	public boolean checkUser(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			System.out.println("Geçerli ad soyad...");
			return true;
		}
		System.out.println("Geçersiz ad soyad..");
		return false;
	}
	
}
