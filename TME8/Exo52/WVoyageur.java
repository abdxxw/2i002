public class WVoyageur extends Wagon{
    protected int nbPlaces;

      public WVoyageur(int n,String m,int nb,int nbp){
        super(n,m,nb);
        nbPlaces = nbp;
    }
    public WVoyageur(){
        this(0,"",0,0);
    }
    public String toString(){
        return super.toString()+", nombre de places :"+nbPlaces;
    }
}