public class Voiture extends AMoteur{
    
    public Voiture(double cap){
        super(cap);
    }
    public String toString(){
        return "Voiture : "+super.toString();
    }
     public void transporter(int n, int km){
         if(enPanne())
             System.out.println("plus d'essence!");
         else
             System.out.println("la voiture n°"+super.id+" a transporté "+n+" personnes sur "+km+" km.");
    }
}