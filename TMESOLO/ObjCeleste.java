public abstract class ObjCeleste{
    private String nom;
    private static int nbObjCelestes = 0;

    public ObjCeleste(String nom){
        this.nom = nom;
        nbObjCelestes++;
    } 
    public ObjCeleste(char lettre){
        this(lettre+nbObjCelestes+"");
    }

    public String getNom(){
        return nom;
    }

    public String toString(){
        return nom;
    }

    public static int getNbObjCelestes(){
        return nbObjCelestes;
    }
}