public class TestFigure{
    public static void main(String[] args){

        Figure F1 = new Rectangle(5,3);
        Figure F2 = new Carre(3,3);
        Figure F3 = new Ellipse(2,6);
        Figure F4 = new Cercle(4,4);

        System.out.println(F1.toString());
        System.out.println(F2.toString());
        System.out.println(F3.toString());
        System.out.println(F4.toString());


    }
}