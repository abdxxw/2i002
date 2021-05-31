public class TestVillageois{
	public static void main(String[] args){
	Villageois V1 = new Villageois("Max");
	Villageois V2 = new Villageois("Jean");
	Villageois V3 = new Villageois("Matt");
	Villageois V4 = new Villageois("Marc");

	System.out.println(V1.toString());
	System.out.println(V2.toString());
	System.out.println(V3.toString());
	System.out.println(V4.toString());

	double x = V1.poidsSouleve()+V2.poidsSouleve()+V3.poidsSouleve()+V4.poidsSouleve();
	System.out.println("poids totale : "+x);
	if(x>=100)
		System.out.println("les villageois ont réussi à soulever le rocher");
	else
		System.out.println("les villageois n'ont pas réussi à soulever le rocher");
	}
}
