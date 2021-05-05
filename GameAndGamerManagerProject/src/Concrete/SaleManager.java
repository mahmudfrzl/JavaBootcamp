package Concrete;

import Abstract.GameService;
import Abstract.SaleService;
import Entitles.Campaign;
import Entitles.Game;
import Entitles.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void saleOfGame(Game game, Gamer gamer) {
		System.out.println(game.getId() + " id li " + game.getName() + " oyunu " + gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullanici tarafindan " + game.getNumberThRecipientOfTheGame() +" -ci oyuncu olarak " + game.getPrice() + " fiyatina basariyla satin alindi!");
		
	}

	
	@Override
	public void campaignIntegrationInSales(Game game, Campaign campaign,Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " isimli kullanici " + campaign.getPercent() +  " %-li " + campaign.getName() + " kampanyasindan faydalanarak " + game.getName() + " isimli oyunu " + game.getPrice() + " fiyati yerine " + campaign.getAwardOfCampaign(game.getPrice())+" fiyatina basariyla aldi ");
		
	}



	

	
}
