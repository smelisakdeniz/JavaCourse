package day4Homework;

public class NewMemberManager {
	
	public void add (NewMember newMember) {
		
		System.out.println(newMember.getFirstName() + " " + 
		newMember.getLastName()+ " �ye ba�ar�yla eklendi.");
		
		
	}
	
	public void delete (NewMember newMember) {
		
		System.out.println(newMember.getFirstName() + " " + 
		newMember.getLastName()+ " �ye ba�ar�yla silindi.");
		
		
	}
}
