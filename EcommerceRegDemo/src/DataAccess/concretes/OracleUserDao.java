package DataAccess.concretes;
import java.util.ArrayList;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class OracleUserDao  implements UserDao{

	
	public ArrayList<User> users=new ArrayList<User>();
	
	public OracleUserDao() {
		super();
		
	}

		@Override
		public void add(User user) {
			users.add(user);
			System.out.println("Saved to db: ");
			
			//users.stream().filter(x -> x.getId() == 1).findFirst().get();
		}

		@Override
		public void login(String mail,String password) {
			System.out.println("Kullanýcý giriþi baþarýlý..");
		}

}
