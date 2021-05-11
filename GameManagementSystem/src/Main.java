import Adaptors.MernisServiceAdaptor;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Gamer;

public class Main {
	public static void main() {
		 Gamer gamer1=new Gamer("Furkan", "Bakal", "12345678901",1997);
		 GamerCheckManager gamerCheckManager=new GamerCheckManager();
		 gamerCheckManager.Check(gamer1);
	}
}
