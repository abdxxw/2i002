public abstract class Astre extends ObjCeleste{

      public Astre(String nom){
        super(nom);
    } 
    public Astre(char lettre){
        super(lettre);
    }

    public abstract double getMasse();

    public String toString(){
        String s = String.format("%.2e",getMasse());
        return super.toString()+" de masse "+s+" kg";
    }
}