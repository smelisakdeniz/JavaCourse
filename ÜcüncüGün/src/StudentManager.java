
public class StudentManager extends UserManager{
	
	@Override
	
	public void add(User user) {
		System.out.println( user.getNameSurname() + " " + " ��renci eklendi");
	}
	
	@Override
	public void logged (User user) {
		
		System.out.println(user.getNameSurname()+ " " + "��renci giri� yapt�");
	} 
	
	@Override
	public void logout(User user) {
		
		System.out.println(user.getNameSurname()+ " " + "��renci ��k�� yapt�");
	}
}
