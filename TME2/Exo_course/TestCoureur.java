public class TestCoureur{
	public static void main(String[] args){
		Coureur c1 = new Coureur();
		Coureur c2 = new Coureur();
		Coureur c3 = new Coureur();
		Coureur c4 = new Coureur();	

		c1.courir();
		c1.passeTemoin(c2);
		c2.courir();
		c2.passeTemoin(c3);
		c3.courir();
		c3.passeTemoin(c4);
		c4.courir();

		System.out.println("le temps total est : "+(c1.getTempsAu100()+c2.getTempsAu100()+c3.getTempsAu100()+c4.getTempsAu100()));
	}
}
