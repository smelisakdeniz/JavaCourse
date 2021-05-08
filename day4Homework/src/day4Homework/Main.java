package day4Homework;

public class Main {

	public static void main(String[] args) {
		
		NewMemberManager newMemberManager = new NewMemberManager();
		NewMember newMember = new NewMember("Ayþe" , "CAN");
		newMemberManager.add(newMember);
		
		MernisManager mernisManager = new MernisManager();
		Mernis mernis = new Mernis("12345678900", "Ayþe", "CAN", "01.03.1994");
		mernisManager.enter(mernis);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "ÝKÝNCÝ OYUN %50 ÝNDÝRÝMLÝ", 50);
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		Sales sales = new Sales(2, "Call Of Duty",230);
		salesManager.sale(newMember, sales);
		
		
		
		

	}

}
