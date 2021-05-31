public class Tracteur{
	private Cabine c;
	private Roue r1,r2,r3,r4;
	
	public Tracteur(Cabine c,Roue r1,Roue r2,Roue r3,Roue r4){
		this.c=c;
		this.r1=r1;
		this.r2=r2;
		this.r3=r3;
		this.r4=r4;
	}

	public String toString(){
		return "Tracteur : "+c.toString()+"\n"+r1.toString()+"\n"+r2.toString()+"\n"+r3.toString()+"\n"+r4.toString();
	}

	public void peindre(String couleur){
		c.setCouleur(couleur);
	}

	public Tracteur clone(){
		return new Tracteur(c.clone(),r1.clone(),r2.clone(),r3.clone(),r4.clone());
	}

	
}
