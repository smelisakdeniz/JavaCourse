
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getNameSurname()+ " " + "Kullan�c� Eklendi.");
	}
	
	public void logged(User user) {
		System.out.println(user.getNameSurname()+ " " + "olarak giri� yap�ld�");
	}
	
	public void logout(User user) {
		System.out.println("��k�� yap�ld�");
	}
		
		
	public void addMultiple(User[] users){
	    for (User user: users){
	    System.out.println("Kullan�c� eklendi: "+ user.getNameSurname());
	        }
	}
}
