import java.util.ArrayList;

public class Train{
    private Motrice m;
    private ArrayList<Wagon> wagons;
    public Train(Motrice m){
        this.m = m;
        wagons = new ArrayList<Wagon>();
    }

    public void ajouter(Wagon w){
        wagons.add(w);
    }

    public String toString(){
        String temp = "Train : \n"+m.toString()+"\n";
        for(Wagon w : wagons)
            temp += w.toString()+"\n";
        
        return temp;

    }

    public double poids(){
        double max = 0;
         for(Wagon w : wagons)
            if(w instanceof WMarchandise)
                if(((WMarchandise) w).getPoids() > max)
                    max = ((WMarchandise) w).getPoids();

        return max;
    }
}