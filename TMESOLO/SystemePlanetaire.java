public class SystemePlanetaire extends ObjCeleste{
    private Etoile etoile;
    private Astre[] tabAstres;
    private int nbAstres;

    public SystemePlanetaire(String nom, Etoile etoile, int nbMaxAstres){
        super(nom);
        this.etoile = etoile;
        tabAstres = new Astre[nbMaxAstres];
        nbAstres = 0;
    }


    public Etoile getEtoile(){
        return etoile;
    }

    public void ajouter(Astre a){
        if(tabAstres.length == nbAstres){
            System.out.println("System Plein");
            return;
        }
        tabAstres[nbAstres] = a;
        nbAstres++;
    }
    
    
    public void ajouter(Planete p){
       /* if(tabAstres.length == nbAstres){
            System.out.println("System Plein");
            return
        }*/
        if(!(p.getEtoile().equals(etoile))){
            System.out.println("Etoiles non identiques");
            return;
        }
       /* tabAstres[nbAstres] = p;
        nbAstres++;*/
        ajouter((Astre) p);
    }

    public double masseTotale(){
        double x=0;
        for(Astre a : tabAstres){
            x+=a.getMasse();
        }
        x+=etoile.getMasse();
        return x;
    }


    public int compterPlanetes(){
        int x=0;
        for(Astre a : tabAstres){
            if(a instanceof Planete)
                x++;
        }
        return x;
    }

    public String toString(){
        String out="Systeme avec etoile centrale :"+etoile.toString()+"\n";

        for(Astre a : tabAstres){
            if(a instanceof Planete)
                out+=a.toString()+"\n";
        }
        return out;
    }


}