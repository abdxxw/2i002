public class Test{
    public static void main(String[] args){

        Managerie m = new Managerie(5);
        m.ajouter(new Vache("Vache1",11,4));
        m.ajouter(new Boa("Boa546",5));
        m.ajouter(new MillePattes("MP546461",1,44));
        m.ajouter(new Saumon("Saumon41515",1));
        m.ajouter(new Canard("Canard1",2,2));

       System.out.println(m.toString());

       m.midi();
       m.vieillirTous();


       System.out.println(m.toString());
    }
}