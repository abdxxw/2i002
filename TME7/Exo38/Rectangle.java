public class Rectangle extends Figure2D{
    protected double x,y;

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Rectangle(){
        this(1,1);
    }
    public double perimetre(){
        return (x+y)*2;
    }
    public double surface(){
        return x*y;
    }
    public String toString(){
        return "Rectangle : Longeur "+x+" largeur "+y+super.toString();
    }
}