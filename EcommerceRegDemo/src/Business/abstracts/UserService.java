package Business.abstracts;

import Entities.concretes.User;

public interface UserService {
	public void register(User user);
	public void login(User user);
	
	public void googleRegister(User user);
	public void googleLogin(User user);
}
