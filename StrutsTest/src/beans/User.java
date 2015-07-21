package beans;

public class User {  
	private String userID;  
    private String username;  
    private String password;  
    private int gender;  
  
    public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    }  
  
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public int getGender() {  
        return gender;  
    }  
  
    public void setGender(int gender) {  
        this.gender = gender;  
    }  
  
}  
