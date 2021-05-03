
public class StudentManager extends UserManager{
	
	@Override
	
	public void add(User user) {
		System.out.println( user.getNameSurname() + " " + " öðrenci eklendi");
	}
	
	@Override
	public void logged (User user) {
		
		System.out.println(user.getNameSurname()+ " " + "öðrenci giriþ yaptý");
	} 
	
	@Override
	public void logout(User user) {
		
		System.out.println(user.getNameSurname()+ " " + "öðrenci çýkýþ yaptý");
	}
}
