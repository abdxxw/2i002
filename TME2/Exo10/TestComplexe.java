class TestComplexe{
	public static void main(String[] args){
		Complexe c1 = new Complexe(-2,3.1);
		Complexe c2 = new Complexe(2.5,-1);
		Complexe c3 = new Complexe(1.7,0);

		if(c1.estReel())
			System.out.println(c1.toString()+" est un reel");
		if(c2.estReel())
			System.out.println(c2.toString()+" est un reel");
		if(c3.estReel())
			System.out.println(c3.toString()+" est un reel");

		System.out.println("c1 + c2 = "+(c1.addition(c2)).toString()); 
			//resultat: (0.5 + 2.1 i)

		System.out.println("c2 * c3 = "+(c2.multiplication(c3)).toString()); 
			//resultat: (4.25 + -1.7 i)


}
}
