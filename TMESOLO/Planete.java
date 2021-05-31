public class Planete extends Astre implements Spherique{
    private double rayon;
    private Etoile etoile;

    public Planete(String nom,Etoile etoile){
        super(nom);
        this.etoile=etoile;
        this.rayon = etoile.getRayon() / (int)(Math.random()*100+20);
    }
    public Planete(){
        super('P');
        this.rayon = 1e7;
    }

    public double getMasse(){
        return rayon / etoile.getRayon();
    }


    public double getRayon(){
        return rayon;
    }

    public Etoile getEtoile(){
        return etoile;
    }

    public String toString(){
        String s = String.format("%.2e",rayon);
        return "Planete "+super.toString()+" de rayon "+s+" km tourne autour de l'etoile "+etoile.getNom();
    }
}