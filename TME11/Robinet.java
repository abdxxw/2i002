public class Robinet extends Reservoir{

    public Reservoir(Ingredient i){
        super(i,Double.POSITIVE_INFINITY);
    }

    public void recuperer(double x) throws RecuperationIngredientException{
        if(Math.random() < 0.002)
            throw new RecuperationIngredientException(i.toString()+" Verifier que le robinet est bien ouvert");
    }
}