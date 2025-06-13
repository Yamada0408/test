package bean;

public class Administrator {
	private int administrator_id;
	private String administrator_password;
	
	public Administrator() {
		this.administrator_id = 0;
		this.administrator_password = null;
	}

	public int getAdministrator_id() {
		return administrator_id;
	}

	public void setAdministrator_id(int administrator_id) {
		this.administrator_id = administrator_id;
	}

	public String getAdministrator_password() {
		return administrator_password;
	}

	public void setAdministrator_password(String administrator_password) {
		this.administrator_password = administrator_password;
	}
}
