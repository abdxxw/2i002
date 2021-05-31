public class Departement{
    public int num_departement;
    public static int cpt = 0;
    public int num;
    public char l1,l2;

    public Departement(){
        cpt++;
        num_departement = cpt;
        num = 0;
        l1 = 'A';
        l2 = 'A';

    }

    public String getPlaque(){
        String temp;
        if((num == 999)&&(l1 == 'Z')&&(l2 == 'Z'))
                System.out.println("MAX PLAQUES");
        else{
            num++;
            if(num > 999){
                num=1;
            if(l2 == 'Z'){
                  l2 = 'A';
                  l1++;
            }else
                  l2++;
            }
        }
              return num+" "+l1+l2+" "+num_departement;
    }
}