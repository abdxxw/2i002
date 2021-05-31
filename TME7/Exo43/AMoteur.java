public class AMoteur extends Vehicule{
    protected double cap,niv;


    public AMoteur(double cap){
        super();
        this.cap =cap;
        this.niv = 0;

    }
    public String toString(){
        return super.toString()+" Avec Moteur , capacité :"+cap+" niveau : "+niv;
    }
    
    public void approvisionner(double nbLittres){
        niv+=nbLittres;
    }

    public boolean enPanne(){
        return niv<=0;
    }

}