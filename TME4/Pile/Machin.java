public class Machin{
	private String nom;
	private int valeur;

	public Machin(String n,int x){
		nom =n;
		valeur =x;
	}

	public String getNom(){
		return nom;
	}

	public String toString(){
		return "nom : "+nom+", valeur : "+valeur;
	}
}
