public abstract class AnimalPattes extends Animal{
    protected int nbPattes;

    public AnimalPattes(String nom, int age, int nb){
        super(nom,age);
        nbPattes = nb;
    } 
    
    public AnimalPattes(String nom){
         this(nom,1,2);
    }


}