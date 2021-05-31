public class AdresseIP{
    private static final int x =192;
    private static final int y =168;
    private static int[] tab = {x,y,0,0};
    public static String getAdresseIP(){
            tab[3]++;
        if(tab[3] > 255){
            tab[3] = 0;
            tab[2]++;
        }
        if((tab[2] > 255)){
             System.out.println("MAX IP");
             tab[2]--;
             tab[3] = 255;
        }
        return tab[0]+"."+tab[1]+"."+tab[2]+"."+tab[3];
    }

}