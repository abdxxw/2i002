public abstract class Wagon extends ElemTrain{
    protected int nbPortes;

      public Wagon(int n,String m,int nb){
        super(n,m);
        nbPortes = nb;
    }
    public Wagon(){
        this(0,"",0);
    }
    public String toString(){
        return super.toString()+", nombre de porte :"+nbPortes;
    }
}