package day4Homework;

public class Main {

	public static void main(String[] args) {
		
		NewMemberManager newMemberManager = new NewMemberManager();
		NewMember newMember = new NewMember("Ay�e" , "CAN");
		newMemberManager.add(newMember);
		
		MernisManager mernisManager = new MernisManager();
		Mernis mernis = new Mernis("12345678900", "Ay�e", "CAN", "01.03.1994");
		mernisManager.enter(mernis);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "�K�NC� OYUN %50 �ND�R�ML�", 50);
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		Sales sales = new Sales(2, "Call Of Duty",230);
		salesManager.sale(newMember, sales);
		
		
		
		

	}

}
