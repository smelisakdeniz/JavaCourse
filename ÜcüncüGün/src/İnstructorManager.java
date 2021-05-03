
public class ÝnstructorManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println( user.getNameSurname() + " " + " eðitmen eklendi");
	}
	
	@Override
	public void logged (User user) {
		
		System.out.println(user.getNameSurname()+ " " + "eðitmen giriþ yaptý");
	} 
	
	@Override
	public void logout(User user) {
		
		System.out.println(user.getNameSurname()+ " " + "eðitmen çýkýþ yaptý");
	}
}
