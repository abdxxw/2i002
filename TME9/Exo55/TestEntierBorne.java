public class TestEntierBorne{
    public static void main(String[] args){
        try{
            String s = Clavier.saisirLigne("Donnez un entier");
            int  x = Integer.parseInt(s);
            Thread.sleep(2000);
            EntierBorne e = new EntierBorne(x);
            e = e.somme(new EntierBorne(10));
            e = e.divPar(new EntierBorne(6));
            e = new EntierBorne(4).factorielle();
            System.out.println(e.toString());
        }catch(NumberFormatException nfe){
            System.out.println("Pas entier");
        }catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }catch(HorsBornesException hbe){
            System.out.println(hbe.getMessage());
        }catch(DivisionParZeroException dpze){
            System.out.println(dpze.getMessage());
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}