public class Vipere extends Animal{
    private static int cpt =0;
    public final int id;

    public Vipere(int x, int y){
        super(x,y,"Vipere");
        id=cpt;
        cpt++;
    }

    public String toString(){
        return  String.format("v%02d", id);
    }

      public void afficher(){
        System.out.println(type+" ("+x+","+y+") id :"+this.toString());
    }

    public boolean equals (Object o){
        if (o != null && (o.getClass().equals(this.getClass()))){
            
            Vipere x = (Vipere)o;
            return (this.id == x.id);
        }
         return false;
    } 
}