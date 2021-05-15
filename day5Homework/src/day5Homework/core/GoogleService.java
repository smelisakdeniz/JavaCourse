package day5Homework.core;

public interface GoogleService {
	void signUp(int id, String email, String firstName,String lastName,String password);
	void logIn(String email,String password);
}
