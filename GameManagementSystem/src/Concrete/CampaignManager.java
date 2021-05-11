package Concrete;

import Entities.Campaign;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ "added the sellings.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ "deleted the sellings.");
	}

}
