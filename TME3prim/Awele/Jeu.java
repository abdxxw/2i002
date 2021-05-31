import java.util.Scanner;

public class Jeu {

	private Joueur[] J;
	private Joueur main;
	private Case[][] plateau;
	
	public Joueur[] getJ() {
		return J;
	}
	public void setJ(Joueur[] j) {
		J = j;
	}
	public Joueur getMain() {
		return main;
	}
	public void setMain(Joueur main) {
		this.main = main;
	}
	public Case[][] getPlateau() {
		return plateau;
	}
	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}
	
	
	public Jeu() {
		J = new Joueur[]{new Joueur(1),new Joueur(2)};
		plateau = new Case[6][J.length];
		main = J[0];
		for(int i=0;i<J.length;i++)
			for(int j=0;j<6;j++)
			plateau[j][i] = new Case(J[i]);
		
	}

	public String toString() {
		String S="";
		for(int j=0;j<J.length;j++) {
			for(int i=0;i<plateau.length;i++)
				S+="====";
			    S+="\n";
			for(int i=0;i<plateau.length;i++) {
				S+="| ";
				S+=plateau[i][j].getNbBilles();
				S+=" ";
			}
			    S+="|";
		        S+="\n";
			
		}

		for(int i=0;i<plateau.length;i++)
			S+="====";
		    S+="\n";
		return S;
	}
	public void changeJoueur() {
		if(main == J[0])
			main = J[1];
		else
			main = J[0];
	}
	
	public int choisirCase() {
		int x,y;
		boolean B=true;
		do {
		System.out.println("choisir une case :"+this.getMain().toString());
		Scanner e = new Scanner(System.in);
		x = e.nextInt();

		System.out.println("Confirmer votre choix? Oui : 1 , Non : autre");
		y = e.nextInt();
		if(y==1)
			B=false;
		}while((x-1>=0)&&(x-1<plateau.length)&&B);
		return x;
	}
	
	public void unCoup(int i) {
		int k,h,x;
		
		if(main == J[0]) {
			k=i+1;
			h=1;
		}else {
			k=-i-1;
			h=0;
		}
		if(plateau[Math.abs(k)-1][h].getNbBilles() == 0)
			System.out.println("Case Vide");
		else {
			
			x = plateau[i][h].getNbBilles();
			plateau[i][h].setNbBilles(0);
			while(x>0){
				x--;
				if(k==1) {
				     h=0;
					k=-k;
				}else if(k == -plateau.length) {
					h=1;
					k=-k;
				}else 
					k--;
				
				plateau[Math.abs(k)-1][h].setNbBilles(plateau[Math.abs(k)-1][h].getNbBilles()+1);
				
			}
				
			if(k<0)
				h=0;
			else 
				h=1;
			if(plateau[Math.abs(k)-1][h].getNbBilles() == 3) {
				main.setGain(main.getGain()+2);
				plateau[Math.abs(k)-1][h].setNbBilles(0);
				if(k==1) {
				     h=0;
					k=-k;
				}else if(k == -plateau.length) {
					h=1;
					k=-k;
				}else 
					k--;
				if((plateau[Math.abs(k)-1][h].getNbBilles() == 2)&&(plateau[Math.abs(k)-1][h].getProp() != main))
					main.setGain(main.getGain()+2);
				plateau[Math.abs(k)-1][h].setNbBilles(0);
			}

			System.out.println(this.toString());
			this.changeJoueur();

		}
			
			
			
	}
	
	public boolean jouer() {

		int x=0;
			for(int j = 0;j<J.length;j++)
				x += J[j].getGain();
			if(4*J.length*plateau.length-x <= 12)
				return false;
			return true;
	}
	public void finDePartie() {
		if (!jouer())
			System.out.println("FIN DE PARTIE");
			Joueur x = J[0];
		for(int j = 1;j<J.length;j++)
			if(x.getGain()<J[j].getGain())
				x = J[j];
		System.out.println(x.toString()+ " GAGNE");
		
	}
	
	
	
}
