public class TestMonTableau{
    public static void main(String[] args){
        MonTableau t = new MonTableau(3);
        try{
            for(int i=0;i<10;i++)
                t.ajouter(1);
        }catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Depassement des bornes a la position "+aiobe.getMessage());
        }catch (TabPleinException tpe){
            System.out.println(tpe.getMessage());
        }
    }
}