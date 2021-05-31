import java.util.Scanner;
public class Clavier{

    public static String saisirLigne(String msg){
        Scanner e = new Scanner(System.in);
        System.out.println(msg);
        return e.nextLine();
    }
}