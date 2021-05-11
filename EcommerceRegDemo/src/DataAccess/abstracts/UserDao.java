package DataAccess.abstracts;

import Entities.concretes.User;

public interface UserDao {
	public void add(User user);
	public void login(String mail,String password);
}
