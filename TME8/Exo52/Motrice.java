public class Motrice extends ElemTrain{

    protected double puissance;
      public Motrice(int n,String m,double p){
        super(n,m);
        puissance = p;
    }
    public Motrice(){
        this(0,"",0);
    }
    public String toString(){
        return super.toString()+", puissance :"+puissance;
    }
}