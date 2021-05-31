public class Vehicule{
    public static int cpt =0;
    protected int id;
    protected int distance;

    public Vehicule(){
        cpt++;
        id=cpt;
        distance = 0;
    }

    public String toString(){
        return "Vehicule : id "+id+" distance "+distance;
    }
    public void rouler(){
        distance++;
    }

}