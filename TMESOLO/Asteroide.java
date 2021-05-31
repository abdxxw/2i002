public class Asteroide extends Astre{
    private double masse;

    public Asteroide(String nom,double masse){
        super(nom);
        this.masse=masse;
    }
    public Asteroide(){
        super('A');
        this.masse=1e18;
    }


    public double getMasse(){
        return masse;
    }

    public String toString(){
        return "Asteroide "+super.toString();
    }
}