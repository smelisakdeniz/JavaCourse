package day4Homework;

public class CampaignManager{
	public void add(Campaign campaign) {
		System.out.println("Yeni Kampanya " + campaign.getCampaignName());
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Kampanyas� g�ncellendi");
	
		System.out.println("Yeni kampanya indirimi :" + campaign.getCampaignDiscount() );
	}
	
	public void delete (Campaign campaign) {
		System.out.println( campaign.getCampaignName() + " Kampanyas� sona erdi");
	}
}
