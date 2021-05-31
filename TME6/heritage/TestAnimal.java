public class TestAnimal{
    public static void main(String[] args){
        Animal p = new Poule(1,2);
        Animal v = new Vipere(5,3);
        Animal r = new Renard(4,-2);

        p.afficher();
        v.afficher();
        r.afficher();

        p.move(1,1);
        v.move(0,2);
        r.move(-2,-1);

        p.afficher();
        v.afficher();
        r.afficher();
    }
}