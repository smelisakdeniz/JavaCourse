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
		//üyelik ile ilgili
		// Doðru üyelik giriþleri
		
		confirmationService.signUp(1, "Ali", "CAN", "ali@gmail.com", "124578");
		confirmationService.signUp(2, "Ayþe", "GEDÝK", "aysegedik@gmail.com", "235689");
		confirmationService.signUp(3, "Cansu","CÝN", "cansucin@gmail.com", "");
		
		// hatalý giriþ bilgileri
		
		confirmationService.signUp(4, "Mümin", "Enerji", "muminenerji@gmail.com", "147"); //þifre yanlýþ
		confirmationService.signUp(5, "Feride", "ÇÝÇEK", "aaaa", "963258"); // varolmayan e mail adresi
		confirmationService.signUp(6, "a", "b", "asdfg@gmail.com", "789456"); // Eksik isim ve soyadý giriþi
		confirmationService.signUp(8, "Ali", "POLAT", "ali@gmail.com", "741369"); // ayný email adresi kullanmak
		
		
		System.out.println("---------GÝRÝÞ----------");
		confirmationService.logIn("smelis@gmail.com", "968541"); // doðru giriþ 
		confirmationService.logIn("smelis@gmail.com", "258"); // yanlýþ þifre giriþi
		confirmationService.logIn("smelis@gmaili.com", ""); // þifresiz giriþ 
		confirmationService.logIn("smelis@gmai.com", "654321"); // yanlýþ email giriþi 
	}
		
}
