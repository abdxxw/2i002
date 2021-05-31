public class Cercle extends Ellipse{

    public Cercle(int a, int b){
        super(a,b);
    }
    public Cercle(){
        super();
    }

    public String toString(){
        return "Cercle : Rayon "+a+" Surface :"+surface()+" perimetre : "+perimetre();
    }
}
