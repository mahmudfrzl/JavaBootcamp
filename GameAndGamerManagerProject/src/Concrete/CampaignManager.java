package Concrete;

import Abstract.CampaignService;
import Entitles.Campaign;

public class CampaignManager implements CampaignService{


	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya " + campaign.getStartDate() +" -den " + campaign.getDueDate() +" -a kadar sisteme kayd edildi " );
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getNumberOfCampaign() + " -ci " + campaign.getName() + " kampanyasi basariyla guncellendi"  );
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya kaldirildi" );
		
	}


	

	
	
	
	
	

}
