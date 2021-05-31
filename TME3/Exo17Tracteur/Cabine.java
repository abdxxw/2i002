public class Cabine{
	private double volume;
	private String couleur;
	
	public Cabine(double volume,String couleur){
		this.volume = volume;
		this.couleur = couleur;
	}

	public String toString(){
		return "Cabine : volume "+volume+" m3 , couleur "+couleur;
	}

	public void setCouleur(String couleur){
		this.couleur=couleur;
	}
	public Cabine clone(){
		return new Cabine(volume,couleur);
	}
}
