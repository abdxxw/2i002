public class Orchestre{
    private Instrument[] tab;
    private int nbInstMax,nbInsNow;

    public Orchestre(int nbInstMax){
        this.nbInsNow = 0;
        this.nbInstMax =nbInstMax;
        tab = new Instrument[nbInstMax];
    }

    public void ajouterInstrument(Instrument i){

        if(nbInsNow<nbInstMax){
            tab[nbInsNow] =  i;
            nbInsNow++;
        }else{
            System.out.println("ERROR MAX INSTRUEMENTS");
        }
    }

    public void jouer(){

        for(int i=0;i<nbInsNow;i++){
            tab[i].jouer();
            /*if(tab[i] instanceof Piano)
                    ((Piano)tab[i]).jouer();
            else if(tab[i] instanceof Guitare)
                    ((Guitare)tab[i]).jouer();
            else
                    System.out.println("INCOMPATIBLE TYPE");*/

        }
    }

}