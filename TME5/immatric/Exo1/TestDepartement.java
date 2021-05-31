public class TestDepartement{
    public static void main(String[] args){
        Departement d1 = new Departement();
        Departement d2 = new Departement();
        Departement d3 = new Departement();

       /* System.out.println(d1.getPlaque());
        System.out.println(d1.getPlaque());
        System.out.println(d2.getPlaque());
        System.out.println(d2.getPlaque());
        System.out.println(d3.getPlaque());
        System.out.println(d1.getPlaque());
        System.out.println(d2.getPlaque());
        System.out.println(d3.getPlaque());
        System.out.println(d3.getPlaque());
        System.out.println(d2.getPlaque());*/
        System.out.println(d1.getPlaque());
        System.out.println(d1.getPlaque());
        System.out.println("...");


        for(int i=0;i<100000;i++){

            d1.getPlaque();
            if((d1.l2 == 'A')&&(d1.l1 == 'A')&&(d1.num == 998)){
                  System.out.println(d1.getPlaque());
                  System.out.println(d1.getPlaque());
                  System.out.println("...");

            } 
            if((d1.l2 == 'Z')&&(d1.l1 == 'A')&&(d1.num == 998)){
                  System.out.println(d1.getPlaque());
                  System.out.println(d1.getPlaque());
                  System.out.println("...");

            }

                  
        

            


        
        }
    }
}