
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getNameSurname()+ " " + "Kullanýcý Eklendi.");
	}
	
	public void logged(User user) {
		System.out.println(user.getNameSurname()+ " " + "olarak giriþ yapýldý");
	}
	
	public void logout(User user) {
		System.out.println("Çýkýþ yapýldý");
	}
		
		
	public void addMultiple(User[] users){
	    for (User user: users){
	    System.out.println("Kullanýcý eklendi: "+ user.getNameSurname());
	        }
	}
}
