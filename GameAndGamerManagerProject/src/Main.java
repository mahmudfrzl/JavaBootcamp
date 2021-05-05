import Abstract.GamerCheckService;
import Abstract.GamerService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entitles.Campaign;
import Entitles.Game;
import Entitles.Gamer;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- OYUNCULARIN SISTEME KAYIT ISLEMLERI ---");
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		Gamer gamer1 = new Gamer("AA54334", "Mahmud ", "Ferzeli", 2003);
		Gamer gamer2 = new Gamer("TC23412", "Yusuf", "Karatas", 2000);
		Gamer gamer3 = new Gamer("TC25671", "Engin", "Demirog", 1982);
		gamerManager.register(gamer1);
		gamerManager.register(gamer2);
		gamerManager.register(gamer3);
		System.out.println("\n");
		System.out.println("--- KAMPANYALARIN BASLANMASI ---");
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign("Ramazan Bayrami", "3", 1500, "16.04.2020", "05.05.2020", 10);
		Campaign campaign2 = new Campaign("Bahar", "2", 2356, "24.07.2020", "12.08.2020", 20);
		Campaign campaign3 = new Campaign("Kýþ", "3", 5000, "21.10.2020", "07.01.2021", 25);

		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		
		System.out.println("\n");
		System.out.println("---OYUNLARIN INDIRILMESI,SILINMESI,GUNCELLENMESI");
		

		GameManager gameManager = new GameManager();
		Game game = new Game(5, "CsGo", 1246235, 2345, 5000, 132445);
		Game game1 = new Game(5, "Valorant", 34667, 2352, 500, 123452);
		Game game2 = new Game(12, "FiFa 2020", 1200, 32354, 3245, 16752);
		Game game3 = new Game(5, "Point Blank", 7329, 9875, 123, 97421);
		gameManager.get(game2, gamer1);
		gameManager.get(game3, gamer3);
		gameManager.update(game1);
		gameManager.delete(game, gamer1);
		
		System.out.println("\n");
		System.out.println("---OYUNLARIN SATIN ALINMASI");
		SaleManager saleManager = new SaleManager();
		saleManager.campaignIntegrationInSales(game2, campaign1, gamer1);
		saleManager.saleOfGame(game, gamer2);
		saleManager.saleOfGame(game3, gamer3);
		saleManager.campaignIntegrationInSales(game, campaign1, gamer2);

	}

}
