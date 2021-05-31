public class Velo extends SansMoteur{

  
    public String toString(){
        return "Velo : "+super.toString();
    }

       public void transporter(String depart, String arrivee){
        System.out.println("le velo n°"+super.id+" a roulé de "+depart+" à "+arrivee);
    }
}