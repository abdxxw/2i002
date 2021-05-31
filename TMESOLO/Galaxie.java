import java.util.ArrayList;

public class Galaxie{
    private ArrayList<ObjCeleste> liste;

    public Galaxie(){
        liste = new ArrayList<ObjCeleste>();
    }
    public void ajouter(ObjCeleste o){
        liste.add(o);
    }

    public Spherique getPlusGrandSpherique(){
        double maxR=0;
        Spherique max= null;
        for(ObjCeleste o : liste){
            if(o instanceof SystemePlanetaire){
                SystemePlanetaire s = (SystemePlanetaire) o;
                if(s.getEtoile().getRayon() > maxR){
                    maxR = s.getEtoile().getRayon();
                    max = s.getEtoile();
                }

            }
            if(o instanceof Spherique){
                Spherique temp = (Spherique) o;
                if (temp.getRayon() > maxR){
                    maxR = temp.getRayon();
                    max = temp;
                }

            }
        }
        return max;
    }

    


}