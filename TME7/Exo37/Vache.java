public class Vache extends AnimalPattes{

     public Vache(String nom, int age, int nb){
        super(nom,age,nb);
    } 
    
    public Vache(String nom){
         super(nom);
    }

    public String toString(){
        return super.toString()+" a "+super.nbPattes+" pattes";
    }
    
    public void crier(){
        System.out.println("Mouu");
    }
}