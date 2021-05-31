public class Emplacement{
	 private Carte carte;
	 private String nom;
	
	public Emplacement(String nom){
		this.nom = nom;
	}
	public Emplacement(String nom, Carte carte){
		this(nom);
		this.carte=carte;
	}
	public String toString(){
		if(carte == null)
			return nom+" : Vide";
		else
			return nom+" : "+carte.toString();	
	}
	public boolean estVide(){
		return carte == null;
	}
	public boolean poser(Carte carte){
		if(this.estVide()){
			this.carte = carte;	
			return true;
		}else
			return false;
	}
	public Carte enlever(){
		Carte x = new Carte(this.carte.toString());
		this.carte = null;
		return x;
	}
}
