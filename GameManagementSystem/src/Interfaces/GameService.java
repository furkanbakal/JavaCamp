package Interfaces;

import Entities.Game;
import Entities.Gamer;

public interface GameService {
	public void add(Game game, Gamer gamer);
	public void delete(Game game, Gamer gamer);
}
