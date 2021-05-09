package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entitles.Gamer;

public class GamerManager implements GamerService {
		private GamerCheckService gamerCheckService;
			

		public GamerManager(GamerCheckService gamerCheckService) {
			
			this.gamerCheckService = gamerCheckService;
		}
		
		

		@Override
		public void register(Gamer gamer) {
			if(gamerCheckService.ifCheckRealPerson(gamer)) {
				System.out.println(gamer.getFirstName() + " "+ gamer.getLastName() + " isimli kullanýcý baþarýyla kayd edilmiþdir!");
			}else {
				System.out.println("Girilen bilgiler geçersizdir, Lütfen yeniden deneyin");
			}
			
		}


		@Override
		public void update(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " "+ gamer.getLastName() + " isimli kullanýcýnýn bilgileri baþarýyla yenilenmiþdir!");
			
		}

		@Override
		public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " "+ gamer.getLastName() + " isimli kullanýcý baþarýyla sistemden silinmiþdir!");
			
		}











}
