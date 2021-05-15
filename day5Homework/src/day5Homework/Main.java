package day5Homework;

import day5Homework.business.abstracts.ConfirmationService;
import day5Homework.business.abstracts.UserService;
import day5Homework.business.concretes.ConfirmationManager;
import day5Homework.business.concretes.EmailManager;
import day5Homework.business.concretes.UserManager;
import day5Homework.business.concretes.VerificationManager;
import day5Homework.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao() {
		});
		ConfirmationService confirmationService = new ConfirmationManager(userService, new VerificationManager(),new EmailManager());
		System.out.println("--------------------------------------");
		//�yelik ile ilgili
		// Do�ru �yelik giri�leri
		
		confirmationService.signUp(1, "Ali", "CAN", "ali@gmail.com", "124578");
		confirmationService.signUp(2, "Ay�e", "GED�K", "aysegedik@gmail.com", "235689");
		confirmationService.signUp(3, "Cansu","C�N", "cansucin@gmail.com", "");
		
		// hatal� giri� bilgileri
		
		confirmationService.signUp(4, "M�min", "Enerji", "muminenerji@gmail.com", "147"); //�ifre yanl��
		confirmationService.signUp(5, "Feride", "���EK", "aaaa", "963258"); // varolmayan e mail adresi
		confirmationService.signUp(6, "a", "b", "asdfg@gmail.com", "789456"); // Eksik isim ve soyad� giri�i
		confirmationService.signUp(8, "Ali", "POLAT", "ali@gmail.com", "741369"); // ayn� email adresi kullanmak
		
		
		System.out.println("---------G�R��----------");
		confirmationService.logIn("smelis@gmail.com", "968541"); // do�ru giri� 
		confirmationService.logIn("smelis@gmail.com", "258"); // yanl�� �ifre giri�i
		confirmationService.logIn("smelis@gmaili.com", ""); // �ifresiz giri� 
		confirmationService.logIn("smelis@gmai.com", "654321"); // yanl�� email giri�i 
	}
		
}
