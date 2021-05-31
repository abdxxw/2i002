
public class TestEquipeVillageois {

	public static void main (String[] args) {

		Equipe E1 = new Equipe("Bleu");
		Equipe E2 = new Equipe("Vert");
		Equipe E3 = new Equipe("Rouge");
	

		for(int i=0;i<(int)(Math.random()*20+1);i++) 
			E1.embaucher(new Villageois("VG"));
		for(int i=0;i<(int)(Math.random()*20+1);i++) 
			E2.embaucher(new Villageois("VG"));
		for(int i=0;i<(int)(Math.random()*20+1);i++) 
			E3.embaucher(new Villageois("VG"));
	

	
	if(E1.poidsSouleve() >= 150)
		System.out.println(E1.toString()+"L'equipe peut soulever le rochet\n");
	else
		System.out.println(E1.toString()+"L'equipe ne peut pas soulever le rochet\n");
	
	if(E2.poidsSouleve() >= 150)
		System.out.println(E2.toString()+"L'equipe peut soulever le rochet\n");
	else
		System.out.println(E2.toString()+"L'equipe ne peut pas soulever le rochet\n");
	
	if(E3.poidsSouleve() >= 150)
		System.out.println(E3.toString()+"L'equipe peut soulever le rochet\n");
	else
		System.out.println(E3.toString()+"L'equipe ne peut pas soulever le rochet\n");
		
	
}
	
	
}