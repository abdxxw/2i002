public abstract class ElemTrain{
    protected int numero_serie;
    protected String marque;

    public ElemTrain(int n,String m){
        numero_serie = n;
        marque = m;
    }
    public ElemTrain(){
        this(0,"");
    }
    public String toString(){
        return this.getClass().toString().substring(6)+" : "+numero_serie+" Marque :"+marque;
    }
}