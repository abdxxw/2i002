public class Jeu{

	private Emplacement gauche,milieu,droit;
	private Carte cible;

	public Jeu(){
		cible = new Carte("Dame");
		gauche = new Emplacement("gauche",new Carte());
		milieu = new Emplacement("milieu",cible);
		droit = new Emplacement("droit",new Carte());
		
		
	}

	public String toString(){
		return gauche.toString()+"\n"+milieu.toString()+"\n"+droit.toString();
	}

	public void echanger(Emplacement a, Emplacement b){
		Carte temp = a.enlever();
		a.poser(b.enlever());
		b.poser(temp);
	}

	public void echanger(int i, int j){
		if(i+j == 1)
			echanger(gauche,milieu);
		else if(i+j == 2)
			echanger(gauche,droit);
		else
			echanger(milieu,droit);
			
	}
	
	public boolean choisir(Emplacement a){
			Carte temp = a.enlever();
			a.poser(temp);
		    return temp.toString().equals(this.cible.toString());
		
	}

	public boolean choisir(int i){
		return((i==0 && this.choisir(gauche))||(i==1 && this.choisir(milieu))||(i==2 && this.choisir(droit)));
	
	}
		
	
	
	public void melanger(){
		echanger((int)(Math.random()*3),(int)(Math.random()*3));
	}
	
	public void melanger(int n){
		for(int i=0;i<n;i++)
		   this.melanger();
	}



	

	


}
