public class Cone{
    private double r,h;
    public static final double PI = 3.14159;
    private static int nbCones = 0;

    public Cone(double r, double h){
        this.r = r;
        this.h = h;
        nbCones++;

    }
    public Cone(){
        this(Math.random()*10,Math.random()*10);
    }
    public double getVolume(){
        return 1.0/3*PI*Math.pow(r,2);
    }
    public String toString(){
        return "Cone r="+r+" h="+h+" V="+this.getVolume();
    }
    public static int getNbCones(){
        return nbCones;
    }

}