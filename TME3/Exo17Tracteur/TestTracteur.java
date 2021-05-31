public class TestTracteur{
	public static void main(String[] args){

		Roue GR1 = new Roue(120);
		Roue GR2 = new Roue(120);
		Roue PR1 = new Roue();
		Roue PR2 = new Roue();

		Cabine C = new Cabine(2,"Bleue");
		Tracteur t1 = new Tracteur(C,GR1,GR2,PR1,PR2);	
		System.out.println(t1.toString());

		Tracteur t2=t1.clone();
		t2.peindre("Rouge");
			
		System.out.println(t1.toString());
	}
}
