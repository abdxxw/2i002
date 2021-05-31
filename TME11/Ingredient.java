public class abstract Ingredient{
    private String nom;
    public Ingredient(String nom){
        this.nom = nom;
    }

    public String toString(){
        return nom;
    }

    public boolean equals(Object o){
        if(o==null) return false;
        if(o==this) return true;
        if(o instance of Ingredient)
            Ingredient i = (Ingredient) o;
        if(i.nom == null)&&(nom== null)
            return true;
        else if (i.nom == null)
            return false;
        else if (nom == null)
            return false;
        else
            return nom.equals(i.nom);
    }
}