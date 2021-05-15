package day5Homework.core;

import day5Homework.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void signUp(int id, String email, String firstName, String lastName, String password) {
		GoogleManager manager= new GoogleManager();
		manager.signUp(email,password);
		
	}

	@Override
	public void logIn(String email, String password) {
		GoogleManager manager= new GoogleManager();
		((GoogleService) manager).logIn(email,password);
		
	}

}
