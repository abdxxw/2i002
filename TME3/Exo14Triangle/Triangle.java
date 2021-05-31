public class Triangle{
	Point p1,p2,p3;
	
	public Triangle(){
		p1 = new Point();
		p2 = new Point();
		p3 = new Point();
	}
	public Triangle(Point a,Point b,Point c){
		p1=a;
		p2=b;
		p3=c;
	}
	public double getPerimetre(){
		return p1.distance(p2)+p1.distance(p3)+p2.distance(p3);
	}
	
	public String toString(){
		return "Triangle : "+p1.toString()+","+p2.toString()+","+p3.toString();
	}

	public boolean equals(Triangle T){
		return ((this.p1.equals(T.p1))&&(this.p2.equals(T.p2))&&(this.p3.equals(T.p3)));
	}
}
