public class MainTrain{
    public static void main(String[] args){
        Motrice m = new Motrice(15152,"fdef",155.26);
        Train t = new Train(m);
        t.ajouter(new WVoyageur(14844,"fgzgnhd",3,25));
        t.ajouter(new WMarchandise(8675,"yrlyiyk",1,652.78));
        t.ajouter(new WMarchandise(78678,"qzfrzf",1,529.33));
        t.ajouter(new WVoyageur(17475,"hrzhy",4,30));
        t.ajouter(new WMarchandise(25735,"grzegrzg",1,888.13));


        System.out.println(t.toString());
        System.out.println("poids max : "+t.poids());


    }
}