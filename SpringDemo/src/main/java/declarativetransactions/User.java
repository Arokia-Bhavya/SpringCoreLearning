package declarativetransactions;

public class User {
	
	int id;
	String password;	
	String userName;
	boolean enabled;
	
	public User(int userId, String userName, boolean enabled,String password) {
		super();
		this.id = userId;
		this.userName = userName;
		this.password=password;
		this.enabled = enabled;
	}
	public int getId() {
		return id;
	}
	public void setId(int userId) {
		this.id = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + id + ", userName=" + userName + ", enabled=" + enabled + "]";
	}

}
