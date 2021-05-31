public class Faune{
    public static final int TAILLE = 30;
    private Animal[] tab;

    public Faune(int nb){
        tab = new Animal[nb];
        for(int i =0;i<tab.length;i++){
            if(i<tab.length/3)
                tab[i] = new Poule((int)(Math.random()*TAILLE),(int)(Math.random()*TAILLE));
            else if(i<2*tab.length/3)
                tab[i] = new Renard((int)(Math.random()*TAILLE),(int)(Math.random()*TAILLE));
            else    
                tab[i] = new Vipere((int)(Math.random()*TAILLE),(int)(Math.random()*TAILLE));
         
        }
        
    }
    public Animal[] getTab(){
        return tab;
    }
    public String terrain(){
        String[][] terr = new String[TAILLE][TAILLE];

		for(int i=0;i<TAILLE;i++)
			for(int j=0;j<TAILLE;j++)
                terr[i][j] = "  .";

        for(int i=0;i<tab.length;i++)
            terr[tab[i].getX()][tab[i].getY()] = tab[i].toString();
            
        String temp=" ";
		for(int i=0;i<TAILLE;i++)
			temp+="___";
		
		for(int i=0;i<TAILLE;i++){
				temp+="\n|";
			for(int j=0;j<TAILLE;j++){
				temp+=terr[i][j];
			}
				temp+="  |";
		}
		temp+="\n";
		for(int i=0;i<TAILLE;i++)
			temp+="___";
		return temp;

        
    }
    public int getIndiceAnimalLePlusProche(Animal requete){
        double dist_min=Double.POSITIVE_INFINITY;
        int index = -1;

        for(int i=0;i<tab.length;i++){

            if(tab[i].equals(requete))
                continue;
            if(tab[i] == null)
                continue;
            if (tab[i].distance(requete) < dist_min){
                dist_min = tab[i].distance(requete);
                index = i;
            }
        }
            return index;
    }

    public void etatDeLaFaune(){

        for(int i=0;i<tab.length;i++){
            if(tab[i] != null)
            System.out.println(tab[i].toString()+" a pour animal plus proche "+tab[getIndiceAnimalLePlusProche(tab[i])]);
        }
    }
}