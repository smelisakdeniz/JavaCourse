
public class �nstructorManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println( user.getNameSurname() + " " + " e�itmen eklendi");
	}
	
	@Override
	public void logged (User user) {
		
		System.out.println(user.getNameSurname()+ " " + "e�itmen giri� yapt�");
	} 
	
	@Override
	public void logout(User user) {
		
		System.out.println(user.getNameSurname()+ " " + "e�itmen ��k�� yapt�");
	}
}
