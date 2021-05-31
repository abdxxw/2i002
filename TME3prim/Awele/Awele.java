
public class Awele {

	public static void main(String[] args)
	{
		Jeu game = new Jeu();
		System.out.println(game.toString());
		
		
		do {
			
			game.unCoup(game.choisirCase());
			if(!game.jouer())
				break;
			else
			    game.unCoup(game.choisirCase());
		}while(game.jouer());
	}
	
	
}
