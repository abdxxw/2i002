import java.util.ArrayList;

public class Etudiant{
    private String nom;
    private int[] notes;
    private int now;
    private static ArrayList<Etudiant> liste = new ArrayList<Etudiant>();

    public Etudiant(String nom){
        this.nom = nom;
        notes = new int[5];
        now =0;
        liste.add(this);
    }

    public String toString(){
        String temp=nom+" ";
        for(int i=0;i<now;i++)
            temp+=notes[i]+" ";
        return temp;
    }

    public void entrerNote(int note) throws TabNotesPleinException{
        if(now >= notes.length)
            throw new TabNotesPleinException();
        notes[now] = note;
        now++;

    }

    public static void afficher(){
        for(Etudiant e : Etudiant.liste){
            System.out.println(e.toString());
        }
    }

    
}