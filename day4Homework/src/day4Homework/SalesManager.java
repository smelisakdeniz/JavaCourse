package day4Homework;

public class SalesManager {
	public void sale (NewMember newMember, Sales sales) {
		System.out.println();
		System.out.println(sales.getGameName() + " oyunu " + newMember.getFirstName() + " " +
				newMember.getLastName() + " üyesine " + sales.getGamePrice() + " satýldý.");
	}
}
