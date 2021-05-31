public class Canard extends AnimalPattes{


     public Canard(String nom, int age, int nb){
        super(nom,age,nb);
    } 
    
    public Canard(String nom){
         super(nom);
    }
      public String toString(){
        return super.toString()+" a "+super.nbPattes+" pattes";
    }
    
      
    public void crier(){
        System.out.println("Quackk");
    }
}