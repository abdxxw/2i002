public abstract class Alea{
    public static char lettre(){
         
        return (char)((int) (Math.random()*26)+'a');
    }
    public static String chaine(){
        String temp ="";
        for(int i=0;i<10;i++)  
            temp+= lettre();
            return temp;


    }
     public static void main(String[] args){
        System.out.println(lettre());
        System.out.println(chaine());
    }
}