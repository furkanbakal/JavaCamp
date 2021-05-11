package Interfaces;

import Entities.Gamer;

public interface GamerService {
	public void sign(Gamer gamer);
	public void update(Gamer gamer);
	public void delete(Gamer gamer);
}
