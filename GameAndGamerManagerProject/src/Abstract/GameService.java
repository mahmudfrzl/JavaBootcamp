package Abstract;

import Entitles.Game;
import Entitles.Gamer;

public interface GameService {
		void get(Game game, Gamer gamer);
		void delete(Game game,Gamer gamer);
		void update(Game game);
		
}
