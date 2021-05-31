public class Coureur{
	private int nuDossard;
	private double tempsAu100;
	private boolean aLeTemoin;

	public Coureur(int nuDossard){
		this.nuDossard = nuDossard;
		tempsAu100 = Math.random()*4+12;
		aLeTemoin = false;
	}
	public Coureur(){
		this((int)(Math.random()*1000+1));
	}

	public int getNuDossard(){
		return this.nuDossard;
	}

	public double getTempsAu100(){
		return this.tempsAu100;
	}

	public boolean getALeTemoin(){
		return this.aLeTemoin;
	}

	public void setALeTemoin(boolean b){
		this.aLeTemoin = b;
	}
	
	public String toString(){
		if(this.aLeTemoin)
		    return "Coureur "+this.nuDossard+" tempsAu100 : "+this.tempsAu100+"s au 100m aLeTemoin : oui .";
		else
		    return "Coureur "+this.nuDossard+" tempsAu100 : "+this.tempsAu100+"s au 100m aLeTemoin : non .";
			
	}
	
	public void passeTemoin(Coureur c){
		System.out.println("moi, coureur "+this.nuDossard+", je passe le temoin au coureur "+c.getNuDossard());
		this.aLeTemoin= false;
		c.setALeTemoin(true);
	}

	public void courir(){
		System.out.println("je suis le coureur "+this.nuDossard+" et je cours");
	}

	

}
