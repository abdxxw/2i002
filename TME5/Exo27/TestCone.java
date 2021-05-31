public class TestCone{
    public static void main(String[] args){
        Cone c1 = new Cone();
        Cone c2 = new Cone(5,10);

        System.out.println(c1.toString()+"\n"+c2.toString());
        System.out.println(c1.getNbCones());
        System.out.println(c2.getNbCones());
        System.out.println(Cone.getNbCones());


    }

}