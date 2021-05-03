package homework;

public class User {
	int id;
	String nameSurname;
	String email;
	String password;
	
	
	
	public User() {
		
	}

	public User(int id, String nameSurname, String email,String password) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.email = email;
		this.password = password;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}


	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
