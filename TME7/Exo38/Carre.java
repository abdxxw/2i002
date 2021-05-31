public class Carre extends Rectangle{

    public Carre(int x, int y){
        super(x,y);
    }
    public Carre(){
        super();
    }

    public String toString(){
        return "Carré : Coté "+x+" Surface :"+surface()+" perimetre : "+perimetre();
    }
}
