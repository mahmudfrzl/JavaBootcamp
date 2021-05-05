package Concrete;

import Abstract.GameService;
import Entitles.Game;
import Entitles.Gamer;

public class GameManager implements GameService {
	public void get(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "isimli  kullanici " + game.getId()
				+ " idsine sahip " + game.getName() + " isimli oyunu baþarýyla sisteme ekledi");
	}

	public void delete(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullanici " + game.getId()
				+ " idsine sahip " + game.getName() + " isimli oyunu sistemden baþarýyla sildi ");
	}

	public void update(Game game) {
		System.out.println(game.getId() + " idsine sahip " + game.getName() + " isimli oyunu güncelledi ");
	}

}
