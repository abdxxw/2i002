public class Reservoir{
    private Ingredient i;
    private double capacite;
    private double niveau;


    public Reservoir(Ingredient i, double capacite){
        this.i = i;
        this.capacite = capacite;
        this.niveau = capacite;
    }

    public Ingredient getI(){
        return i;
    }

    public void remplir(){
        niveau = capacite;
    }

    public void recuperer(double x) throws RecuperationIngredientException{
        if(x>niveau)
            throw new RecuperationIngredientException(i.toString()+" Niveau insuffisant : quantité disponible "+niveau);
        if(Math.random() < 0.001)
            throw new RecuperationIngredientException(i.toString()+" Erreur inconnu");
        niveau-=x;
    }
}