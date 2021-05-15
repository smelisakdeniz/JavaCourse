package day5Homework.business.abstracts;

public interface ConfirmationService {
	void signUp(int id,String firstName,String lastName,String email,String password);
	void logIn(String email,String password);
}
