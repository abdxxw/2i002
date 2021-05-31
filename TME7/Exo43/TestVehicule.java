public class TestVehicule{
    public static void main(String[] args){
        Velo v1 = new Velo();
        Voiture v2 = new Voiture(40.5);
        Camion v3 = new Camion(100.0);

        System.out.println("Vehicules : \n"+v1+"\n"+v2+"\n"+v3);
        System.out.println();
        v2.approvisionner(35.0);
        v3.approvisionner(70.0);
        System.out.println();
        v1.transporter("Dijon","Valence");
        v2.transporter(5,300);
        v3.transporter("tuiles",1000);
    }
}