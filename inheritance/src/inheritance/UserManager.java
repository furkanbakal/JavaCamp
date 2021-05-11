package inheritance;

public class UserManager {
	public void sign() {
		System.out.println("Başarıyla kayıt oldunuz");
	}
	
	public void login(User user) {
		System.out.println("Hoşgeldiniz" +user.getId()+ " "+user.getEmail()  ) ;
	}
}
