package day5Homework.business.abstracts;

import day5Homework.entities.concretes.User;

public interface EmailService {
	
	void emailVerification(User user);

	boolean emailVerification(String email);
}
