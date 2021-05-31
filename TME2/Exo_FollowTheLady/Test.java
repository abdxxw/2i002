public class Test{
	public static void main(String[] args){
		Emplacement E = new Emplacement ("gauche");
		Carte C1 = new Carte("Dame");
		
		E.poser(C1);
		System.out.println(E.toString());
		Carte C2 = E.enlever();
		System.out.println(E.toString());
		int k=0;
		Jeu J = new Jeu();
		for(int i=0;i<1000;i++) {
		J.melanger(100);
		if(J.choisir(2))
			k++;
		System.out.println(J.choisir(2));
		J.melanger(100);
		}
		
		System.out.println(k);

	}
}

