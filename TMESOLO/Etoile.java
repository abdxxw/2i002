public class Etoile extends Astre implements Spherique{
    private double rayon;


    public Etoile(String nom,double rayon){
        super(nom);
        this.rayon=rayon;
    }
    public Etoile(){
        super('E');
        this.rayon = 1e7;
    }

    public double getMasse(){
        return 1e12 * Math.PI * Math.pow(rayon,3);
    }

    public double getRayon(){
        return rayon;
    }

    public String toString(){
        String s = String.format("%.2e",rayon);
        return "Etoile "+super.toString()+" de rayon "+s+" km";
    }

    public boolean equals(Etoile e){
        return (e.rayon == rayon)&& (e.getNom().equals(getNom()));
    }
}