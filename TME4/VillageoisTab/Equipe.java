
public class Equipe {

	private String nom;
	private Villageois[] V;
	private int nbV;
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Villageois[] getV() {
		return V;
	}
	public void setV(Villageois[] v) {
		V = v;
	}
	public int getNbV() {
		return nbV;
	}
	public void setNbV(int nbV) {
		this.nbV = nbV;
	}
	public Equipe(String nom) {
		
		this.nom = nom;
		V = new Villageois[20];
		nbV = 0;
	}
	public void embaucher(Villageois v) {
		if (this.nbV < V.length) {
			V[this.nbV] = v;
			nbV++;
		}else
			System.out.println("Tableaux remplis");
		
	}
	public double poidsSouleve() {
			double S = 0;
		for(int i=0;i<this.nbV;i++)
			S+=V[i].poidsSouleve();
		
		return S;
	}
	
	public String toString() {
		String S ="Equipe :" + nom + ", contient les villageois :\n";
		
				  for(int i =0;i<nbV;i++)
					  S+=V[i].toString();
			   S+="L'equipe souleve un poids total de " + this.poidsSouleve() + " Kg\n";
					return S;
	}
	
	
	
	
	
}
