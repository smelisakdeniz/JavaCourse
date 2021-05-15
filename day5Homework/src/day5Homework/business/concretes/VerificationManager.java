package day5Homework.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5Homework.business.abstracts.VerificationService;
import day5Homework.entities.concretes.User;

public class VerificationManager implements VerificationService{

	@Override
	public boolean vEmail(User user) {
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(user.getEmail());
		if (user.getEmail()==null||matcher.matches() == false) {
			System.out.println("E-posta formatýnda giriniz");
			return false;
		}
		return true;
	}

	@Override
	public boolean vPassword(User user) {
		if (user.getPassword()==null||user.getPassword().length()<6) {
			System.out.println("En az 6 karakterden oluþmalýdýr");
			return false;
		}
		return true;
	}

	@Override
	public boolean vFirstName(User user) {
		if (user.getFirstName()==null||user.getFirstName().length()<2) {
			System.out.println("En az iki karakterden oluþmalýdýr");
			return false;
		}
		return true;
	}

	@Override
	public boolean vLastName(User user) {
		if (user.getLastName()==null||user.getLastName().length()<2) {
			System.out.println("En az iki karakterden oluþmalýdýr");
			return false;
		}
		return true;
	}


}
