public class Nomencalture{
    private static String[] tabNom = {"Tatooine","Vulcain","Pandora"};

    public static String getNomPlanete(){
        int x = (int)(Math.random()*3);
        return tabNom[x];
    }
}