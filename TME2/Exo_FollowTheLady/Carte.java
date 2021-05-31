public class Carte{
	 private String nom;
	
	public Carte(){
		this("Valet");
	}
	public Carte(String n){
		nom=n;
	}
	public String toString(){
		return nom;
	}
	
}
