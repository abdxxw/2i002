public class Poule extends Animal{
    private static int cpt =0;
    public final int id;
     public Poule(int x, int y){
        super(x,y,"Poule");
        id=cpt;
        cpt++;
    }

    
    public String toString(){
        return  String.format("p%02d", id);
    }

    public void afficher(){
        System.out.println(type+" ("+x+","+y+") id :"+this.toString());
    }



    public boolean equals (Object o){
        if (o != null && (o.getClass().equals(this.getClass()))){
            
            Poule x = (Poule)o;
            return (this.id == x.id);
        }
         return false;
    }
}