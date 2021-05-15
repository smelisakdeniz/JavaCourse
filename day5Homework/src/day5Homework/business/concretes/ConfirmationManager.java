package day5Homework.business.concretes;


import day5Homework.business.abstracts.ConfirmationService;
import day5Homework.business.abstracts.EmailService;
import day5Homework.business.abstracts.UserService;
import day5Homework.business.abstracts.VerificationService;
import day5Homework.entities.concretes.User;

public class ConfirmationManager implements ConfirmationService{

	private UserService userService;
	private VerificationService verificationService;
	private EmailService emailService;	
	
	public ConfirmationManager(UserService userService, VerificationService verificationService,
			EmailService emailService) {
		super();
		this.userService = userService;
		this.verificationService = verificationService;
		this.emailService = emailService;
	}
	
	
	@Override
	public void logIn(String email, String password) {
		
		User user = userService.getLoginInfos(email, password);
		
		if(!isLogIn(email,password)){
			System.out.println("L�tfen E-mail ve �ifrenizi yaz�n�z");
			return;
		}else if (user == null ){
			System.out.println("E-mail veya �ifre yanl�� girildi");
			return;
		}else {
			System.out.println("HO�GELD�N�Z! " + user.getFirstName());
			return;
		}
		
	}
	
	

	@Override
	public void signUp(int id, String email, String firstName, String lastName, String password) {
		User user = new User (id,email,firstName,lastName,password);
		if(verificationService.vEmail(user) == true &&
				verificationService.vPassword(user)== true &&
				emailService.emailVerification(email)) {
			
			System.out.println("Merhaba " + user.getFirstName()+ " " + user.getLastName()+ 
					"L�tfen e-posta adresinize gelen do�rulama ba�lant�s�na t�klay�n�z.");
		
		}
		else if(!vInvalidEmail(email)) {
			System.out.println("Bu e-mail ba�ka kullan�c� taraf�ndan kullan�l�yor");
		}
	}



	private boolean vInvalidEmail(String email) {
		return userService.getByEmail(email)== null;
	}
	private boolean isLogIn(String email, String password) {
		if(email.length()>0 && password.length()>0) {
			return true;
		}
		
		return false;
		
	}

}	

	
	
