public class TestEtudiants{
    public static void main(String[] args){
        Etudiant e = null;
        for(int i=0;i<args.length;i++){
            try{
                int x = Integer.parseInt(args[i]);
                e.entrerNote(x);
            }catch(NumberFormatException nfe){
                e = new Etudiant(args[i]);
            }catch(TabNotesPleinException tpe){
                System.out.println(tpe.getMessage());
            }

        }
        System.out.println();
        Etudiant.afficher();
    }
}