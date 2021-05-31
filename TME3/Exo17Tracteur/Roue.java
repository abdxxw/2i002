public class Roue{
	private int diam;
		
	public Roue(int x){
		diam = x;
	}
	public Roue(){
		this(60);
	}
	public String toString(){
		return "Roue : diamètre = "+diam+" cm";
	}

	public Roue clone(){
		return new Roue(diam);
	}
	
}
