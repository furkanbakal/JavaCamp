package Interfaces;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SellService {
	public void sellingByCampaign(Gamer gamer,Game game,Campaign campaign);
	public void selling(Gamer gamer, Game game);
}
