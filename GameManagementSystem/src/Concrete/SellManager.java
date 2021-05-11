package Concrete;

import Entities.Game;
import Entities.Gamer;
import Entities.Campaign;
import Interfaces.SellService;

public class SellManager implements SellService{

	
	
	@Override
	public void sellingByCampaign(Gamer gamer, Game game, Campaign campaign) {
		double totalPrice=game.getPrice()-(game.getPrice()*campaign.getDiscountAmount()/100);
		
		System.out.println("Satýn alan: " +gamer.getFirstName()+ " " +gamer.getLastName());
		System.out.println("Alýnan oyun: " +game.getName());
		System.out.println("Fiyat: " +totalPrice);
	}

	@Override
	public void selling(Gamer gamer, Game game) {
		System.out.println("Satýn alan: " +gamer.getFirstName()+ " " +gamer.getLastName());
		System.out.println("Alýnan oyun: " +game.getName());
		System.out.println("Fiyat: " +game.getName());	
	}

}
