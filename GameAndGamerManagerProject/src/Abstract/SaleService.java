package Abstract;

import Entitles.Campaign;
import Entitles.Game;
import Entitles.Gamer;

public interface SaleService {
		void saleOfGame(Game game, Gamer gamer );
		
		void campaignIntegrationInSales(Game game, Campaign campaign, Gamer gamer);
}
