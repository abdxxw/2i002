public class WMarchandise extends Wagon{
    protected double poids;

      public WMarchandise(int n,String m,int nb,double p){
        super(n,m,nb);
        poids = p;
    }
    public WMarchandise(){
        this(0,"",0,0);
    }
    public String toString(){
        return super.toString()+", poids :"+poids;
    }

    public double getPoids(){
        return poids;
    }
}