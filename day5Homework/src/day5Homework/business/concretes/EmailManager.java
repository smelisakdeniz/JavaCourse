package day5Homework.business.concretes;

import day5Homework.business.abstracts.EmailService;
import day5Homework.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public void emailVerification(User user) {
		System.out.println("Tebrikler ! Hesabýnýz baþarýyla aktifleþtirildi " + user.getFirstName());
		
	}

	@Override
	public boolean emailVerification(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
