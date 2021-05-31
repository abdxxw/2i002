public class TestTriangle{
	public static void main(String[] args){
		
		Point p1 = new Point(2,5);
		Point p2 = new Point(-2,2);
		Point p3 = new Point(3,-1);

		Triangle T1 = new Triangle(p1,p2,p3);
		System.out.println(T1.toString());
		System.out.println("longeur p1 p2 : "+p1.distance(p2));
		System.out.println("longeur p1 p3 : "+p1.distance(p3));
		System.out.println("longeur p2 p3 : "+p2.distance(p3));
		System.out.println("périmètre : "+T1.getPerimetre());


		Triangle T2 = new Triangle(new Point(2,5),new Point(-2,2),new Point(3,-1));

		System.out.println(T1.equals(T2));
	}
}
