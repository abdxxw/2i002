public class Pile{
	private Machin[] tab;
	private int elem_courant;

	public Pile(int taille_max){
		tab = new Machin[taille_max];
		elem_courant = 0;
	}

	public boolean estVide(){
		return elem_courant == 0;
	}
	public boolean estPleine(){
		return elem_courant == tab.length;
	}
	public void empiler(Machin m){
		if(this.estPleine())
		 	System.out.println("Erreur : Pile deja Pleine");
		else{
			tab[elem_courant] = m;
			elem_courant++;
		}
	}
	public Machin depiler(){
		
		if(this.estVide()){
		 	System.out.println("Erreur : Pile Vide");
			return null;		
		}else{
			elem_courant--;
			Machin temp = tab[elem_courant];
			tab[elem_courant] = null;
			return temp;
						
			
		}


	}
	public String toString(){
		String temp="";
		for(int i=0;i<elem_courant;i++)
			temp+=tab[i].toString()+"\n";

		return temp;
	}

}
