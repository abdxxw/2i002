public class Recette{
    private Ingredients[] tabIng;
    private double[] tabQuan;
    private double prix;
    private String nom;

    public Recette(int nb,double prix,String nom){
        tabIng = new Ingredients[nb];
        tabQuan = new double[nb];
        this.prix = prix;
        this.nom = nom;
    }

    public Ingredients[] getTabIng(){
        return tabIng;
    }public double[] getTabQuan(){
        return tabQuan;
    }

    public double getPrix(){
        return prix;
    }
    public String toString(){
        return nom+" prix : "+prix+" euro";
    }
}