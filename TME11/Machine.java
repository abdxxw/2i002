import java.util.ArrayList;

public class Machine{
    private ArrayList<Reservoir> lRes;
    private ArrayList<Recette>  lRec;
    private double credit;
    private static int cpt = 0;
    private int id;


    public Machine(){
        lRes = new ArrayList<Reservoir>();
        lRec = new ArrayList<Recette>();
        credit = 0;
        id = cpt;
        cpt++;
    }


    public void ajouterReservoir(Reservoir r){
        lRes.add(r);
    }
    public void ajouterRecette(Recette r){
        lRec.add(r);
    }
    public void ajouterCredit(double d){
        credit+=d;
    }
    public void rendreLaMonnaie(){
        credit = 0;
    }

    public void remplir(){
        for(Reservoir r : lRes)
            r.remplir();
    }

    private Reservoir trouverReservoir(Ingredient i){
        for(Reservoir r : lRes)
            if(r.getI().equals(i))
                return r;

        return null;
    }

    public boolean checkup(){
          for(Recette r : lRec){
            for(int i=0;i<r.getTabIng().length;i++){
                Reservoir x = trouverReservoir(r.getTabIng()[i]);
                if(x==null)
                    return false;
            }
            System.out.println(r.toString()+" OK");
          }
          return true;
    }

    public boolean commander(int ri){
        if(ri> lRec.size())
            return false;
        Recette x = lRec.get(ri);
        if(x.getPrix()>credit)
            return false;
        for(int i=0;i<x.getTabIng().length;i++){
            Reservoir r = trouverReservoir(x.getTabIng()[i]);
            try{
              r.recuperer(x.getTabQuan()[i]);
            }catch(RecuperationIngredientException e){
                System.out.println()
                return false;
            }
        }

        credit-=x.getPrix();

    }
}