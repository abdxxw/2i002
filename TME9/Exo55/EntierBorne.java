public class EntierBorne{
    private int x;
    public EntierBorne(int x)throws HorsBornesException{
        if((x>10000)||(x<-10000))
            throw new HorsBornesException();
        this.x = x;
    }
    public String toString(){
        return "EntierBorne : "+x;
    }

    public EntierBorne somme(EntierBorne i) throws HorsBornesException{
        int s = i.x+x;
        return new EntierBorne(s);
    }

    public EntierBorne divPar(EntierBorne i) throws HorsBornesException, DivisionParZeroException{
        if(i.x==0)
            throw new DivisionParZeroException();
        int q = x/i.x;
        return new EntierBorne(q);
    }

    public EntierBorne factorielle() throws HorsBornesException, IllegalArgumentException{
        if(x<0)
            throw new IllegalArgumentException();
        int r=1;
        for(int i=2;i<=x;i++)
            r=r*i;
        return new EntierBorne(r);
        
    }
}