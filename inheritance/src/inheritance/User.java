package inheritance;

public class User {
	private int id;
	private String email;
	private String password;
	
	public User() {
	
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
	public void setPassword(String password) {
		this.password=password;
	}
    
}
