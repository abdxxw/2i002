public class MillePattes extends AnimalPattes{


     public MillePattes(String nom, int age, int nb){
        super(nom,age,nb);
    } 
    
    public MillePattes(String nom){
         super(nom);
    }
    public String toString(){
        return super.toString()+" a "+super.nbPattes+" pattes";
    }

      
    public void crier(){
        System.out.println("ampamapmama");
    }
}