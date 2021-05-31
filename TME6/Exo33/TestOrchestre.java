public class TestOrchestre{
    public static void main(String[] args){
        Orchestre o = new Orchestre(10);
        o.ajouterInstrument(new Piano(1,2));
        o.ajouterInstrument(new Guitare(5,1));
        o.jouer();
    }
}