package loginandregestration;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Loginbean {
	
	private String Username;
	private String Password;
	
	
	public Loginbean() {
	}

	public String getUserName() {
		return Username;
	}

	public void setUserName(String userName) {
		Username = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public String checkValidity() { 
		if (Username.equals("Admin") && Password.equals("Admin")){ 
			return ("loginresponcesuccess");

		}
		else{
			return("loginresponcefail");
		}
	

	}

}