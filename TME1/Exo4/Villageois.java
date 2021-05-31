public class Villageois{
	private String nom;
	private double poids;
	private boolean malade;

	public Villageois(String nomVillageois){
		nom = nomVillageois;
		poids = Math.random()*100+50;
		malade = Math.random() < 0.20;
	}
	public String getNom(){
		return nom;
	}
	public double getPoids(){
		return poids;
	}
	public boolean getMalade(){
		return malade;
	}
	public  String toString(){
	if(this.malade)
		return "VILLAGEOIS : "+nom+", poids : "+poids+" kg, malade : oui";
	else
		return "VILLAGEOIS : "+nom+", poids : "+poids+" kg, malade : non";
	}
	public double poidsSouleve(){
	if(this.malade)
		return this.poids/3;
	else
		return this.poids/4;
	}
}
