public class MonTableau{
    private int[] tab;
    private int lgReelle;

    public MonTableau(int tailleMax){
        tab = new int[tailleMax];
        lgReelle = 0;
    }

    public void ajouter(int n) throws TabPleinException{
        if(lgReelle >= tab.length)
            throw new TabPleinException();
        tab[lgReelle] = n;
        lgReelle++;
    }
}