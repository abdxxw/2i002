public class Managerie{

    private Animal[] tab;
    private int n;

    public Managerie(int max){
        tab = new Animal[max];
        n=0;
    }

    public void ajouter(Animal a){
        if (n>tab.length)
            System.out.println("Tableau plein!!!");
        
        tab[n] = a;
        n++;
    }

    public String toString(){
        String s="Animales : \n";
        for(int i=0;i<n;i++){
            s+= tab[i].toString()+"\n";
        }
        return s;

    }

    public void midi(){
        for(Animal a : tab)
            a.crier();
    }
    
    public void vieillirTous(){
        for(Animal a : tab)
            a.vieillir();
    }
    
}