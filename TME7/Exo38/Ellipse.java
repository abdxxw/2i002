public class Ellipse extends Figure2D{
    protected double a,b;

    public Ellipse(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Ellipse(){
        this(1,2);
    }
    public double perimetre(){
        return 2*Math.PI*Math.sqrt((a*a+b*b)/2);
    }
    public double surface(){
        return Math.PI*a*b;
    }
    public String toString(){
        return "Ellipse : demi-petit axe "+a+" demi-grand axe "+b+super.toString();
    }
}