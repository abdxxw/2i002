public class TestPile{
	public static void main(String[] args){
		Pile p = new Pile(10);
		

		p.empiler(new Machin("ftvytftj",122));
		p.empiler(new Machin("gzhiabh",99));
		p.empiler(new Machin("gerqgq",47));
		System.out.println(p.toString());
		Machin m1 = p.depiler();
		System.out.println(p.toString());
		Machin m2 = p.depiler();
		System.out.println(p.toString());
		p.empiler(m1);
		System.out.println(p.toString());
		p.empiler(m2);
		System.out.println(p.toString());
		

	}

}
