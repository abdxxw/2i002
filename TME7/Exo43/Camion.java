public class Camion extends AMoteur{

        
    public Camion(double cap){
        super(cap);
    }
    public String toString(){
        return "Camion : "+super.toString();
    }

     public void transporter(String materiau, int km){
         if(enPanne())
             System.out.println("plus d'essence!");
         else
             System.out.println("le caminon n°"+super.id+" a transporté des "+materiau+" sur "+km+" km.");
    }
}