package day5Homework.business.abstracts;

import day5Homework.entities.concretes.User;

public interface VerificationService {
	
	boolean vEmail(User user);
	boolean vPassword(User user);
	boolean vFirstName(User user);
	boolean vLastName(User user);
	
	
	
}
